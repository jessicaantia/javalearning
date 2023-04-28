package com.application;

import org.springframework.beans.factory.annotation.Autowired;

import com.merida.jpa.repositories.CompanyRepository;

public class Util {
	
	@Autowired
	CompanyRepository companyRepository;
	
	public String getData() {
			companyRepository.findAll();
		 return "Hello";
	}

}
