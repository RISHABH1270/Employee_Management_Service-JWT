package com.example.EmployeeManagementService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.EmployeeManagementService")
public class EmployeeManagementServiceApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(EmployeeManagementServiceApplication.class, args);
	}
}
