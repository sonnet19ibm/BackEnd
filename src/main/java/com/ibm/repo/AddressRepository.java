package com.ibm.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.entity.Address;

/**
 * This Repository is for Address Entity
 * 
 * @author:Gandlaparthi_Pravallika
 * @version:1.0
 * @since:January 2022
 * 
 */

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
