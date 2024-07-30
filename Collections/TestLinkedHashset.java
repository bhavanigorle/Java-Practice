package org.example.Java_Backend.Collections;


import java.util.*;

public  class TestLinkedHashset {
    public static void main(String[] args) {
        Set<Employee> employee = new LinkedHashSet<>();
        Employee p1 = new Employee("Najira", 1211);
        Employee p2 = new Employee("Bhavani", 41867);
        Employee p3 = new Employee("Bhavani", 41866);
        Employee p4 = new Employee("Bhavani", 41866);
        employee.add(p3);
        employee.add(p4);
        employee.add(p1);
        employee.add(p2);

        System.out.println(employee);
        }

}
