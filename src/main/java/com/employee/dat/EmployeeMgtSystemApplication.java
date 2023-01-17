package com.employee.dat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication(scanBasePackages={"com.employee.dat.repository"})
@ComponentScan(basePackages ={"com.employee.dat.controller"})

public class EmployeeMgtSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeMgtSystemApplication.class, args);
	}

}
