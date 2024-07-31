package org.example.Java_Backend;

public class Person{
    static String name;
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static String getName()
    {
        return name;
    }
    public static void setName(String name)
    {
        Person.name=name;
    }

    public static void main(String args[])
    {
       Person p1=new Person();
        p1.setName("Najira");
        System.out.println(p1.getName());
        Person p2=new Person();
        p2.setName("Bhavani");
        System.out.println(p1.getName());
        System.out.println( p2.getName());
        Person p3=new Person();
        p3.setId(123);
        System.out.println(p3.getId());
        Person p4=new Person();
        p4.setId(867);
        System.out.println(p3.getId());
        System.out.println(p4.getId());

    }
}
