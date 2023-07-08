package com.brightology.employeemanagementbackend.repository;

import com.brightology.employeemanagementbackend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
