package com.example.employee.DTO;

public class EmployeePayRollDTO {
    private String name;
    private long salary;

    public EmployeePayRollDTO() {}

    public EmployeePayRollDTO(String name, long salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public long getSalary() { return salary; }
    public void setSalary(long salary) { this.salary = salary; }
}