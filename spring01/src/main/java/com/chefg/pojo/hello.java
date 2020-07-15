package com.chefg.pojo;

import lombok.Data;

@Data
public class hello {
    private String name;


    public void show(){
        System.out.println("hello"+name);
    }
}
