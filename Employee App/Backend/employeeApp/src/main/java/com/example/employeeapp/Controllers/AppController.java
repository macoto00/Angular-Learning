package com.example.employeeapp.Controllers;

import com.example.employeeapp.models.Employee;
import com.example.employeeapp.services.EmployeeServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:55366")
public class AppController {
    private final EmployeeServiceImpl employeeService;

    // create employee
    @PostMapping("/employees")
    public ResponseEntity<?> createEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
        return ResponseEntity.ok().body("Employee created successfully");
    }

    // get all employees
    @GetMapping("/employees")
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok().body(employeeService.getAll());
    }

    // get one by id
    @GetMapping("/employees/{id}")
    public ResponseEntity<?> getEmployeeById(@PathVariable Long id) {
        return ResponseEntity.ok().body(employeeService.getEmployeeById(id));
    }

    // update employee
    @PutMapping("/employees/{id}")
    public ResponseEntity<?> updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
        employeeService.updateEmployee(id, employee);
        return ResponseEntity.ok().body("Employee updated successfully");
    }

    // delete employee
    @DeleteMapping("/employees/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
        return ResponseEntity.ok().body("Employee deleted successfully");
    }
}
