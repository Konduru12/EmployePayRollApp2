package com.example.employee.service;

import com.example.employee.DTO.EmployeePayRollDTO;
import com.example.employee.model.EmployeePayRollModel;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeePayRollService {
    private List<EmployeePayRollModel> employeeList = new ArrayList<>();
    private int empId = 1;

    public EmployeePayRollModel createEmployee(EmployeePayRollDTO dto) {
        EmployeePayRollModel emp = new EmployeePayRollModel(empId++, dto.getName(), dto.getSalary());
        employeeList.add(emp);
        return emp;
    }

    public List<EmployeePayRollModel> getAllEmployees() {
        return employeeList;
    }

    public EmployeePayRollModel getEmployeeById(int id) {
        return employeeList.stream()
                .filter(e -> e.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public EmployeePayRollModel updateEmployee(int id, EmployeePayRollDTO dto) {
        EmployeePayRollModel emp = getEmployeeById(id);
        if (emp != null) {
            employeeList.remove(emp);
            EmployeePayRollModel updated = new EmployeePayRollModel(id, dto.getName(), dto.getSalary());
            employeeList.add(updated);
            return updated;
        }
        return null;
    }

    public boolean deleteEmployee(int id) {
        return employeeList.removeIf(e -> e.getId() == id);
    }
}