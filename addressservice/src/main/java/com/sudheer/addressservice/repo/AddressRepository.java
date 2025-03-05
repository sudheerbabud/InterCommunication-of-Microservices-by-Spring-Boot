package com.sudheer.addressservice.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sudheer.addressservice.model.Address;

public interface AddressRepository extends JpaRepository<Address,Integer>{
	@Query(nativeQuery = true,
		       value = "SELECT ea.id, ea.city, ea.state FROM address ea " +
		               "JOIN employee e ON e.id = ea.empid " +
		               "WHERE ea.empid = :empId")
		Optional<Address> findAddressByEmployeeId(@Param("empId") int empid);


}
