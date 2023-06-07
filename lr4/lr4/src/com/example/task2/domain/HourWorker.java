package com.example.task2.domain;

public class HourWorker extends BaseWorker {
    private double hourStack;
    public HourWorker(){}
    public void setStack(double stack){
        this.hourStack = stack;
    }
    public double getStack(){
        return hourStack;
    }
    public HourWorker(double stack){this.hourStack=stack;}
    @Override
    public double getSalary(){
        return 20.8*8*hourStack;
    }
}
