package org.example.Java_Backend.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestListCollection {
    public static void main(String[] args) {
        List<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        //External Iterator
        for(int i=0;i<numbers.size();i++)
            System.out.println(numbers.get(i));
        Collections.sort(numbers);
        for(int n:numbers)
            System.out.println(n);
        System.out.println(numbers.contains(60));

}
}
