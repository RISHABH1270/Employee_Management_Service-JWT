package com.example.EmployeeManagementService.repository;

import com.example.EmployeeManagementService.model.Employee;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface EmployeeRepository extends CassandraRepository<Employee, String>
{

}