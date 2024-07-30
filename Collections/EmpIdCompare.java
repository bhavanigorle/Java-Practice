package org.example.Java_Backend.Collections;

import java.util.Comparator;

public class EmpIdCompare implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        int value = Integer.compare(o1.getId(), o2.getId());
        if(value!=0)
            return value;
        return o1.getName().compareTo(o2.getName());

    }

//    @Override
//    public int compareTo(Employee o) {
//        return o.getName().compareTo(this.getName());
//    }
}
