package org.example.Java_Backend.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestObjectlist {
    public static void main(String[] args) {
        List<Employee> employee=new ArrayList<>();
        employee.add(new Employee("Bhavani",1211));
        employee.add(new Employee("Najira",1212));
        employee.add(new Employee("Arjun",1213));
        employee.add(new Employee("Draupadi",1214));
        employee.add(new Employee("Krishna",1217));
        employee.add(new Employee("Krishna",1215));

        for(Object e:employee)
            System.out.println(e);
       Collections.sort(employee,new EmpIdCompare());
        for(Object e:employee)
            System.out.println(e);
    }
}
