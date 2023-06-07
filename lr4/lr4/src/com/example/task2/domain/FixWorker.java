package com.example.task2.domain;

public class FixWorker extends BaseWorker{
    public FixWorker(){}
    public FixWorker(double sal) { this.salary=sal; }
    public void setSalary(double sal) { salary=sal;}
    @Override
    public double getSalary() { return salary; }
}
