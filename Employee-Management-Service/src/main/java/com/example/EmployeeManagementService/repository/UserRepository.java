package com.example.EmployeeManagementService.repository;

import com.example.EmployeeManagementService.model.User;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface UserRepository extends CassandraRepository<User, String>
{
    User findByUsername(String username);
}
