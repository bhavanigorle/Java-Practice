package org.example.Java_Backend.Java8;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestJava8 {
    public static void main(String[] args) {
//        Thread thread=new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("In first method");
//            }
//        });
        Thread thread=new Thread(()-> System.out.println("In first method"));//lambda function
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("In second method");
            }
         });
        thread.start();
        thread1.start();
        System.out.println("In main method");

        List<Integer> numbers= Arrays.asList(1,2,3,4,5);
        numbers.forEach(n-> System.out.println(n));//calling the method on my list, for Each takes Consumer functional interfaces accept method
        numbers.forEach(System.out::println);//method reference
        numbers.stream().map(n->String.valueOf(n)).collect(Collectors.toSet());
        List<String> string=  numbers.stream().map(String::valueOf).collect(Collectors.toList());
        System.out.println(string);
        List<String> filter_string=numbers.stream().filter(n->n>2).map(String::valueOf).collect(Collectors.toList());
        System.out.println(filter_string);
        List<String> even_strings=numbers.stream().filter(n->n>3).filter(n->n%2==0).map(String::valueOf).collect(Collectors.toList());
        System.out.println(even_strings);
    }
}
