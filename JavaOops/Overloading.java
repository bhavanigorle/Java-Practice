package org.example.Java_Backend;

public class Overloading {
    public static int add(int a, int b){
       return a+b;
    }
    public static double add(double a, double b){
        return a+b;
    }
    public static double add(int a,double b){
        return a+b;
    }
    public static void main(String args[]){
        System.out.println(add(1,2));
        System.out.println(add(1.5,3.4));
        System.out.println(add(4,3.4));
    }
}
