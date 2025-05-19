package com.example.employee.controller;

import com.example.employee.DTO.EmployeePayRollDTO;
import com.example.employee.model.EmployeePayRollModel;
import com.example.employee.service.EmployeePayRollService;
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
}
