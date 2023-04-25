package com.merida;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import com.merida.jpa.entities.Company;
import com.merida.jpa.repositories.CompanyRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class CustomerRepositoryTests {
	@Autowired
	private TestEntityManager entityManager;

	@Autowired
	private CompanyRepository customers;

	@Test
	public void testFindByLastName() {
		Company company = new Company("first", new Date());
		entityManager.persist(company);

		List<Company> findByName = customers.findByName(company.getName());

		assertThat(findByName).extracting(Company::getName).containsOnly(company.getName());
	}
}
