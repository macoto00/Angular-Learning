package com.example.employeemanager.services;

import com.example.employeemanager.exceptions.UserNotFoundException;
import com.example.employeemanager.models.Employee;
import com.example.employeemanager.repositories.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Override
    public Employee addEmployee(Employee employee) {
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<Employee> findEmployeeById(Long id) {
        return Optional.ofNullable(employeeRepository.findEmployeeById(id).orElseThrow(() -> new UserNotFoundException("User by id " + id + " not found.")));
    }

    @Override
    public void updateEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(Long id) {
        Optional<Employee> employeeToDelete = employeeRepository.findById(id);
        if (employeeToDelete.isPresent()) {
            Employee existingEmployee = employeeToDelete.get();
            employeeRepository.delete(existingEmployee);
        } else {
            throw new UserNotFoundException("User by id " + id + " not found.");
        }
    }
}
