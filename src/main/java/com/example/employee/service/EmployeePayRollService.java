package com.example.employee.service;

import com.example.employee.DTO.EmployeePayRollDTO;
import com.example.employee.model.EmployeePayRollModel;
import org.springframework.stereotype.Service;

@Service
public class EmployeePayRollService {
    public EmployeePayRollModel createEmployee(EmployeePayRollDTO dto) {
        return new EmployeePayRollModel(1, dto.getName(), dto.getSalary());
    }
}