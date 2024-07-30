package org.example.Java_Backend.Collections;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TestHashmap {
    public static void main(String[] args) {
        Map<Employee, String> employee = new HashMap<>();
        Employee p1 = new Employee("Najira", 1211);
        Employee p2 = new Employee("Bhavani", 41867);
        employee.put(p1, "Hacker");
        employee.put(p2, "Java Developer");
        for (Map.Entry<Employee, String> entry : employee.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }
}
