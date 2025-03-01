package org.example.Java_Backend.Java8;

import java.util.Objects;

public class Person {
    private final String name;
    private final int age;
    private String designation;

    public Person(String name,int age) {
        this.name = name;
        this.age=age;
    }
    public Person(String name,int age,String designation) {
        this.name = name;
        this.age=age;
        this.designation=designation;
    }
    public int getAge() {
        return age;
    }


    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getDesignation() {
        return designation;
    }


}
