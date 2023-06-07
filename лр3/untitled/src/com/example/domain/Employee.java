package com.example.domain;

import com.sun.jdi.Value;

public class Employee {
    public int empId;
    public String name;
    public String ssn;
    public double salary;

    public Employee(int empId1, String name1, String ssn1, double salary1) {
        empId = empId1;
        name = name1;
        ssn = ssn1;
        salary = salary1;

    }

    public String getString()
    {
        return name;
    }
    public void setString(String newValue)
    {
        name = newValue;
    }


    public String getSSn()
    {
        return ssn;
    }
    public void setSSn(String newValue)
    {
        ssn = newValue;
    }


    public int getEmpId()
    {
        return empId;
    }
    public void setEmpId(int newValue)
    {
        empId = newValue;
    }


    public double getSalary()
    {
        return salary;
    }
    public void setSalary(double newValue)
    {
        salary = newValue;
    }
}


