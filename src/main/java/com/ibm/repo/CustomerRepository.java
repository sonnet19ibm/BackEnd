package com.ibm.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ibm.entity.Customer;

/**
 * This Repository is for Customer Entity
 * 
 * @author:Gandlaparthi_Pravallika
 * @version:1.0
 * @since:January 2022
 * 
 */

public interface CustomerRepository extends JpaRepository<Customer, Long> {

	@Query(value="select * from customer where email=:email and password=:pass",nativeQuery = true)
	Optional<Customer> authCustomer(@Param("email") String emailId,@Param("pass") String password);

}
