package com.sudheer.empservice.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.sudheer.empservice.service.EmployeeService;

@Configuration
public class EmployeeConfig {

	@Bean
	public EmployeeService employeeBean() {
		return new EmployeeService();
	}
	
	@Bean
	public ModelMapper modelMapperBean() {
		return new ModelMapper();
	}
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	

}
