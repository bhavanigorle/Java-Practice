package org.example.Java_Backend.Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestPerson {
    public static void main(String[] args) {
        List<Person> persons = loadPersons();
        List<Person> filteredPerson=persons.stream().filter(person -> person.getAge()>20).collect(Collectors.toList());
        System.out.println(filteredPerson);
        Map<String,Person> personsmap=persons.stream().collect(Collectors.toMap(Person::getName, person->person));
        System.out.println(personsmap);
        Person per=persons.stream().filter(p->p.getName().startsWith("Ka")).findFirst().orElse(null);
        System.out.println(per);
    }
    private static List<Person> loadPersons() {
        List<Person> personList=new ArrayList<>();
        personList.add(new Person("Kaira",23));
        personList.add(new Person("Bhavani",24));
        personList.add(new Person("najira",19));
        return personList;
    }
}
