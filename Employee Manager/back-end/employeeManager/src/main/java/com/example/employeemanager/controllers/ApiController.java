package com.example.employeemanager.controllers;

import com.example.employeemanager.models.Employee;
import com.example.employeemanager.services.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
@AllArgsConstructor
public class ApiController {
    private final EmployeeService employeeService;

    @PostMapping("/add")
    public ResponseEntity<?> createEmployee(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
        return ResponseEntity.ok().body("Employee created successfully");
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAllEmployees() {
        return ResponseEntity.ok().body(employeeService.findAllEmployees());
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<?> getEmployeeById(@PathVariable("id") Long id) {
        return ResponseEntity.ok().body(employeeService.findEmployeeById(id));
    }

    @PutMapping("/update")
    public ResponseEntity<?> updateEmployee(@RequestBody Employee employee) {
        employeeService.updateEmployee(employee);
        return ResponseEntity.ok().body("Employee updated successfully");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable("id") Long id) {
        employeeService.deleteEmployee(id);
        return ResponseEntity.ok().body("Employee deleted successfully");
    }
}
