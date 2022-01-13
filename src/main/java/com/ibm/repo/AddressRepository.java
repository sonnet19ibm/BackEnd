package com.ibm.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
