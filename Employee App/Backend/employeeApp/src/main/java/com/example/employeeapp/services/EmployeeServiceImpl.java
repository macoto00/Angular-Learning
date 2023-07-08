package com.example.employeeapp.services;

import com.example.employeeapp.Exceptions.ResourceNotFoundException;
import com.example.employeeapp.models.Employee;
import com.example.employeeapp.repositories.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<Employee> getEmployeeById(Long id) {
        return Optional.ofNullable(employeeRepository.findById(id).orElseThrow(ResourceNotFoundException::new));
    }

    @Override
    public void updateEmployee(Long id, Employee employee) {
        Optional<Employee> employeeToUpdate = employeeRepository.findById(id);
        if (employeeToUpdate.isPresent()) {
            Employee existingEmployee = employeeToUpdate.get();
            existingEmployee.setFirstname(employee.getFirstname());
            existingEmployee.setLastname(employee.getLastname());
            existingEmployee.setEmailId(employee.getEmailId());
            employeeRepository.save(existingEmployee);
        } else {
            throw new ResourceNotFoundException();
        }
    }

    @Override
    public void deleteEmployee(Long id) {
        Optional<Employee> employeeToDelete = employeeRepository.findById(id);
        if (employeeToDelete.isPresent()) {
            Employee existingEmployee = employeeToDelete.get();
            employeeRepository.delete(existingEmployee);
        } else {
            throw new ResourceNotFoundException();
        }
    }
}
