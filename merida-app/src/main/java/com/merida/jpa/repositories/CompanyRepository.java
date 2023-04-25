package com.merida.jpa.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.merida.jpa.entities.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {

	List<Company> findByName(String name);

	Company findById(long id);
	
	@Query("SELECT count(e) FROM Empresa e WHERE e.active=true")
	int countCompanies();
}
