package com.merida.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.merida.jpa.entities.Company;
import com.merida.jpa.repositories.CompanyRepository;

@RestController
@RequestMapping("/api")
public class CompanyController {

	@Autowired
	CompanyRepository companyRepository;

	@GetMapping("/company")
	public ResponseEntity<List<Company>> getAllCompanies() {
		try {
			List<Company> companies = new ArrayList<>();

			companyRepository.findAll().forEach(companies::add);

			/*
			 * int i = 0; companies = companyRepository.findAll(); System.out.println();
			 * companies.addAll(companyRepository.findAll()); System.out.println();
			 * 
			 * // For each companyRepository.findAll().forEach(companies::add);
			 * 
			 * // Segunda manera for each for (Company company: companyRepository.findAll())
			 * { company.setActive(false); companies.add(company); }
			 */

			System.out.println("Active companies: " + companyRepository.countCompanies());

			if (companies.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(companies, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/company/{id}")
	public ResponseEntity<Company> getById(@PathVariable("id") long id) {
		Company companyData = companyRepository.findById(id);

		if (companyData != null) {
			return new ResponseEntity<>(companyData, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/company")
	public ResponseEntity<Company> createCompany(@RequestBody Company company) {
		try {
			Company companyInsert = companyRepository.save(new Company(company.getName(), new Date()));
			return new ResponseEntity<>(companyInsert, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PutMapping("/company/{id}")
	public ResponseEntity<Company> updateCompany(@PathVariable("id") long id, @RequestBody Company company) {
		Company companyData = companyRepository.findById(id);

		if (companyData != null) {
			Company companyUpdate = companyData;
			companyUpdate.setName(company.getName());
			companyUpdate.setRegistrationDate(company.getRegistrationDate());
			companyUpdate.setActive(company.isActive());
			return new ResponseEntity<>(companyRepository.save(companyUpdate), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/company/{id}")
	public ResponseEntity<HttpStatus> deleteCompany(@PathVariable("id") long id) {
		try {
			companyRepository.deleteById(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@DeleteMapping("/company")
	public ResponseEntity<HttpStatus> deleteAllCompanies() {
		try {
			companyRepository.deleteAll();
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
}
