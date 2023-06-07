package com.example.domain;

import com.example.Animal;

public class Laska extends Animal implements Pet{
    public Laska(){}
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void play() {
        System.out.println(name + " вроде бы лесное животное");
    }
}
