package com.sudheer.addressservice.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AddressConfig {

	@Bean
	ModelMapper modelMapperBean() {
		return new ModelMapper();
	}
}
