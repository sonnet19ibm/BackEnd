package com.ibm.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ibm.entity.Admin;

/**
 * This Repository is for Administrator Entity
 * 
 * @author:Gandlaparthi_Pravallika
 * @version:1.0
 * @since:January 2022
 * 
 */

public interface AdminRepository extends JpaRepository<Admin, String>{

	@Query(value="select * from admin where email=:email and password=:pass",nativeQuery = true)
	Optional<Admin> authAdmin(@Param("email") String emailId,@Param("pass")String password);
}
