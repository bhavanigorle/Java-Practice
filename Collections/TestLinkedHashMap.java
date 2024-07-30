package org.example.Java_Backend.Collections;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public  class TestLinkedHashMap {
    public static void main(String[] args) {
        Map<Employee, String> employee = new LinkedHashMap<>();
        Employee p1 = new Employee("Najira", 1211);
        Employee p2 = new Employee("Bhavani", 41867);
        Employee p3 = new Employee("Bhavani", 41866);
        Employee p4 = new Employee("Bhavani", 41866);
        employee.put(p1, "Hacker");
        employee.put(p2, "Java Developer");
        employee.put(p3,"FrontEnd Developer");
        employee.put(p4,"Tester");
        for (Map.Entry<Employee, String> entry : employee.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
