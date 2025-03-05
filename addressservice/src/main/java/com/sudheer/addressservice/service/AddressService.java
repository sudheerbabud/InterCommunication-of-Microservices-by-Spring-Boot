package com.sudheer.addressservice.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sudheer.addressservice.model.Address;
import com.sudheer.addressservice.repo.AddressRepository;
import com.sudheer.addressservice.respponse.AddressResponse;

@Service
public class AddressService {

	@Autowired
	private AddressRepository addressRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public AddressResponse findAddressByEmployeeId(int empid) {
		Optional<Address>address=addressRepository.findAddressByEmployeeId(empid);
		AddressResponse addressResponse=modelMapper.map(address, AddressResponse.class);
		return addressResponse;
	}
}
