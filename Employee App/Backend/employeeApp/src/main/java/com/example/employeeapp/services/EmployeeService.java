package com.example.employeeapp.services;

import com.example.employeeapp.models.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    void saveEmployee(Employee employee);
    List<Employee> getAll();
    Optional<Employee> getEmployeeById(Long id);
    void updateEmployee(Long id, Employee employee);
    void deleteEmployee(Long id);
}
