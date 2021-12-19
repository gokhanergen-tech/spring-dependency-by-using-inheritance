package com.guncetek.main;

import com.guncetek.main.Service.ShapeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class Main {

    @Autowired
    private ShapeService shapeService;

    @PostConstruct
    private void postConstructor(){
         shapeService.results();
    }
    public static void main(String ...args){
        SpringApplication.run(Main.class,args);
    }

}
