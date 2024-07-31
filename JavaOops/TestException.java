package org.example.Java_Backend;

public class TestException {
//    static void isValidAge(int age) throws InvalidAgeException{
//        if (age<0)
//            throw new InvalidAgeException("Age can not be negative");
//    }
//
//    public static void main(String[] args) throws IOException {
//       try{
//           isValidAge(-1);
//       } catch (InvalidAgeException e) {
//           throw new IOException(e);
//       }
//    }
    static void divide(int a,int b) throws DivisionException{
        if(b==0)
            throw new DivisionException("Denominator can not be zero");
    }

    public static void main(String[] args) {
        try{
            divide(4,0);
        }
        finally {
            System.out.println("Finally Executed");
        }
    }
}
