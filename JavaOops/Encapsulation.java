package org.example.Java_Backend;

import java.util.Objects;

public class Encapsulation {
    private int age;
    private String name;

    public Encapsulation(int age, String name) {
        Objects.requireNonNull(name,"Name can't be null");
        this.age=age;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public void setName(String name) {
//        if(name==null){
//            throw new IllegalArgumentException("Name can't b rnull");
//        }
//        this.name = name;
//    }
}
