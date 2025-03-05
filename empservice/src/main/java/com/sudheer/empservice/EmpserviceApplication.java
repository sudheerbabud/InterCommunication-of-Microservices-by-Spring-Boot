package com.sudheer.empservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//@EnableFeignClients
public class EmpserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpserviceApplication.class, args);
	}

}
