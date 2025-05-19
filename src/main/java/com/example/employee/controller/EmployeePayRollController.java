package com.example.employee.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeePayRollController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Employee Payroll App";
    }
}