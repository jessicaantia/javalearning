package com.merida.config;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import com.application.Util;
import com.merida.jpa.entities.Company;
import com.merida.jpa.repositories.CompanyRepository;

@Configuration
@EnableScheduling
public class SpringConfig {

	@Autowired
	CompanyRepository companyRepository;
	
	
	Logger log = LoggerFactory.getLogger(getClass());

	@Scheduled(cron = "0 0/2 * * * ?")
	public void scheduleFixedDelayTask() {
		try {
			
			List<Company> companies = new ArrayList<>();

			companyRepository.findAll().forEach(companies::add);

			writeFile(companies);
		} catch (IOException e) {
			e.printStackTrace();
			log.info("");
		}

		System.out.println("Fixed delay task - " + System.currentTimeMillis() / 1000);
	}

	private void writeFile(List<Company> companies) throws IOException {
		// Se crea el archivo
		File fout = new File("out.txt");
		// Preparación
		FileOutputStream fos = new FileOutputStream(fout);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

		for (Company company : companies) {
			bw.write(company.getName());
			bw.newLine();
		}
		bw.close();
	}

}
