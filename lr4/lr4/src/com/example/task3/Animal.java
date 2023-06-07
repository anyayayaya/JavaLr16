package com.example.task3;

import com.example.task3.domain.Beak;
import com.example.task3.domain.Bird;
import com.example.task3.domain.Wings;

public class Animal {
    public static void main(String[] args) {
        Bird b = new Bird(new Beak(),new Wings(), new Wings());
        b.print();
    }

}

