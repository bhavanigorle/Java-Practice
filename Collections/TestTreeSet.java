package org.example.Java_Backend.Collections;

import java.util.*;

public class TestTreeSet {
    public static void main(String[] args) {
//        Set<Integer> numbers = new TreeSet<>();
//        numbers.add(10);
//        numbers.add(10);
//        numbers.add(20);
//        numbers.add(30);
//        numbers.add(40);
//        //External Iterator
//
//        for (int n : numbers)
//            System.out.println(n);
//        System.out.println(numbers.contains(60));
        Set<Employee> employee = new TreeSet<>(new EmpIdCompare());
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
