package org.example.Java_Backend;


import java.util.Scanner;

public class Strings {
    static final String s="Bhavani";
    public static void main(String[] args) {
//        String s1="Hello";
//        String s2="Hello";
//        System.out.println(s1==s2);
//        s1=s1.toLowerCase();
//        System.out.println(s1==s2);
//        String s3=new String("Hello").intern();
//        System.out.println(s2==s3);
//        String s4=new String("Hello");
//        System.out.println(s3==s4);

        System.out.println(Check(null));

    }
    public static boolean Check(String str){
        return s.equals(str);

    }
}
