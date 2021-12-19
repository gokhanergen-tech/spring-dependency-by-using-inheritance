package com.guncetek.main.Models;

import org.springframework.stereotype.Component;

@Component(value = "Circle")
public class Circle extends Shape {

    private int r=2;

    public Circle setR(int r) {
        this.r = r;
        return this;
    }

    @Override
    public float calculateArea() {
        return (float)Math.PI*r*r;
    }
}
