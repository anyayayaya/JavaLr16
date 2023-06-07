package com.example.task3.domain;

public class Bird {

    Beak beak;
    Wings wings1;
    Wings wings2;
    public String name="какая-то птица";
    public Bird(Beak beak, Wings wings1, Wings wings2)
    {
        this.wings1=wings1;
        this.wings2=wings2;
        this.beak=beak;
    }

    public void print(){
        System.out.println(name);
        beak.eat();
        beak.attac();
        wings1.fly();
        wings2.sit();

    }
}
