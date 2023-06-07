package com.example.task2;

import com.example.task2.domain.FixWorker;
import com.example.task2.domain.HourWorker;

public class Worker {
    public static void main(String[] args) {
        HourWorker hw = new HourWorker(10);
        System.out.println("почасовая зарплата: "+hw.getSalary());

        FixWorker fw = new FixWorker(1234);
        System.out.println("фиксированная зарплата: "+fw.getSalary());
    }
}
