package com.sudheer.addressservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sudheer.addressservice.respponse.AddressResponse;
import com.sudheer.addressservice.service.AddressService;

@RestController
public class AddressController {

	@Autowired
	private AddressService addressService;
	
	@GetMapping("/address/{empid}")
	public ResponseEntity<AddressResponse>getAddressByEmployeeId(@PathVariable("empid") int empid){
		AddressResponse addressResponse = addressService.findAddressByEmployeeId(empid);
		return ResponseEntity.status(HttpStatus.OK).body(addressResponse);
	}
}
