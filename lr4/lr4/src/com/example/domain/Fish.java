package com.example.domain;

import com.example.Animal;

public class Fish extends Animal implements Pet {
    public Fish(){}
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    } @Override
    public void play() {
        System.out.println("Рыбка просто плавает");
    }
}
