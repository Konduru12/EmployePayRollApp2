package com.example.employee.controller;

import com.example.employee.DTO.EmployeePayRollDTO;
import com.example.employee.model.EmployeePayRollModel;
import com.example.employee.service.EmployeePayRollService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/employee")
public class EmployeePayRollController {

    @Autowired
    private EmployeePayRollService employeeService;

    @PostMapping("/create")
    public EmployeePayRollModel createEmployee(@RequestBody EmployeePayRollDTO employeeDTO) {
        return employeeService.createEmployee(employeeDTO);
    }

    @GetMapping("/all")
    public List<EmployeePayRollModel> getAll() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public EmployeePayRollModel getById(@PathVariable int id) {
        return employeeService.getEmployeeById(id);
    }

    @PutMapping("/update/{id}")
    public EmployeePayRollModel update(@PathVariable int id, @RequestBody EmployeePayRollDTO dto) {
        return employeeService.updateEmployee(id, dto);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        return employeeService.deleteEmployee(id) ? "Deleted" : "Not Found";
    }
}
