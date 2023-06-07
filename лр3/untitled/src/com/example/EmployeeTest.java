package com.example;

import com.example.domain.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee(101, "Jane Smith", "012-34-5678", 120_345.27);

        System.out.println("Employee ID: "+emp.getEmpId());
        System.out.println("Employee Name: "+emp.getString());
        System.out.println("Employee Soc Sec # "+emp.getSSn());
        System.out.println("Employee salary: "+emp.getSalary());
    }
}
