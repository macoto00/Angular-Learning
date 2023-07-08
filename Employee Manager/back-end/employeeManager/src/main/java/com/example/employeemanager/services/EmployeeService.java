package com.example.employeemanager.services;

import com.example.employeemanager.models.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    Employee addEmployee(Employee employee);
    List<Employee> findAllEmployees();
    Optional<Employee> findEmployeeById(Long id);
    Employee updateEmployee(Employee employee);
    void deleteEmployee(Long id);
}
