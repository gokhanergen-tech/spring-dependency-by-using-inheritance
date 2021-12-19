package com.guncetek.main.Models;

public abstract class Shape {

    private String name;

    public abstract float calculateArea();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
