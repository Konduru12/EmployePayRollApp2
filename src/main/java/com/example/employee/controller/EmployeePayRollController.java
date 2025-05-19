package com.example.employee.controller;

import com.example.employee.DTO.EmployeePayRollDTO;
import com.example.employee.model.EmployeePayRollModel;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeePayRollController {

    @PostMapping("/create")
    public EmployeePayRollModel createEmployee(@RequestBody EmployeePayRollDTO employeeDTO) {
        return new EmployeePayRollModel(1, employeeDTO.getName(), employeeDTO.getSalary());
    }
}