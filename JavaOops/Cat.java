package org.example.Java_Backend;

import org.example.Java_Backend.JavaOops.Animal;

public class Cat extends Animal {
//    public Cat()
//    {
//        super(10);
//        System.out.println("Cat Class");
//    }
//    public Cat(int i)
//    {
//        this();
//        System.out.print("Cat Paramaterized");
//
//    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Cat Eat");
    }
}
