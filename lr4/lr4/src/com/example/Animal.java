package com.example;

import com.example.domain.Cat;
import com.example.domain.Fish;
import com.example.domain.Laska;

public class Animal {
    public Animal(){}
    public String name;
    public Animal(String name) {this.name=name;}
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.name="котык";
        cat.play();
        Fish fish = new Fish();
        fish.name="рыбааа";
        fish.play();
        Laska laska = new Laska();
        laska.name="ласка";
        laska.play();
    }
}
