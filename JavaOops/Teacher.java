package org.example.Java_Backend;

import org.example.Java_Backend.JavaOops.College;

public class Teacher implements College {
    @Override
    public void classes() {
        System.out.println("Teacher class");
    }
}
