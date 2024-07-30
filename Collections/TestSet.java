package org.example.Java_Backend.Collections;

import java.util.*;

public class TestSet {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        //External Iterator
        for (int n : numbers)
            System.out.println(n);

        System.out.println(numbers.contains(60));
    }
}
