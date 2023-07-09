package com.brightology.employeemanagementbackend;

import com.brightology.employeemanagementbackend.model.Employee;
import com.brightology.employeemanagementbackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeManagementBackEndApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeManagementBackEndApplication.class, args);
    }

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {
        Employee employee = new Employee();
        employee.setFirstName("Bright");
        employee.setLastName("Ugochukwu");
        employee.setEmailId("brightology@gmail");
        employeeRepository.save(employee);

        Employee employee1 = new Employee();
        employee1.setFirstName("Jacinta");
        employee1.setLastName("Ugochi");
        employee1.setEmailId("elochukwu@gmail.com");
        employeeRepository.save(employee1);

        Employee employee2 = new Employee();
        employee2.setFirstName("Adaugo");
        employee2.setLastName("Delight");
        employee2.setEmailId("adaugo@gmail.com");
        employeeRepository.save(employee2);

    }
}
