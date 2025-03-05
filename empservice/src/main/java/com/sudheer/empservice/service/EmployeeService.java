package com.sudheer.empservice.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sudheer.empservice.model.Employee;
import com.sudheer.empservice.repo.EmployeeRepo;
import com.sudheer.empservice.response.AddressResponse;
import com.sudheer.empservice.response.EmployeeResponse;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepo employeeRepo;
	
	@Autowired
	ModelMapper modelMapper;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public EmployeeResponse getEmployeeById(int id) {
		Optional<Employee> employee=employeeRepo.findById(id);
		EmployeeResponse employeeResponse = modelMapper.map(employee, EmployeeResponse.class);
		
		AddressResponse addressResponse = restTemplate.getForObject("http://localhost:9292/addressservice/address/{id}", 
  	 	 	AddressResponse.class, id); 
  	employeeResponse.setAddressResponse(addressResponse); 
		
//		Using Feign Client
//		ResponseEntity<AddressResponse>addressResponse= addressClient.getAddressByEmployeeId(id);
//		employeeResponse.setAddressResponse(addressResponse.getBody());
		return employeeResponse;
	}

	
}
