package com.guncetek.main.Models;

import org.springframework.stereotype.Component;

@Component(value = "Rectangle")
public class Rectangle extends Shape {

    private int a=5,b=6;

    public Rectangle setA(int a) {
        this.a = a;
        return this;
    }

    public Rectangle setB(int b) {
        this.b = b;
        return this;
    }

    @Override
    public float calculateArea() {
        return a*b;
    }
}
