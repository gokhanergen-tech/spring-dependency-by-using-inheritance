package com.guncetek.main.Service;

import com.guncetek.main.Interface.ShapeInterface;
import com.guncetek.main.Models.Shape;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ShapeService implements ShapeInterface {
    @Autowired
    @Qualifier("Circle")
    private Shape circle;

    @Autowired
    @Qualifier("Rectangle")
    private Shape rectangle;

    @Override
    public void results() {
        System.out.println(rectangle.calculateArea());
        System.out.println(circle.calculateArea());
    }
}
