package org.example.Java_Backend.Java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Designations {
    public static void main(String[] args) {
        List<Person> persons = loadPersons();
        //With Java 7
//        Map<String, List<Person>> Designation=new HashMap<>();
//        for(Person person:persons){
//            List<Person> person_list=null;
//            if(Designation.containsKey(person.getDesignation())){
//                person_list=Designation.get((person.getDesignation()));
//            }
//            else{
//                person_list=new ArrayList<>();
//                Designation.put(person.getDesignation(),person_list);
//            }
//            person_list.add(person);
//        }
//        System.out.println(Designation);
        //With Java8
        Map<String,List<Person>>Designation=persons.stream().collect(Collectors.groupingBy(Person::getDesignation));
        System.out.println(Designation);
    }
    private static List<Person> loadPersons() {
        List<Person> personList=new ArrayList<>();
        personList.add(new Person("Kaira",23,"Front Developer"));
        personList.add(new Person("Bhavani",24,"Backend Developer"));
        personList.add(new Person("najira",19,"Tester"));
        personList.add(new Person("Arjun",67,"Front Developer"));
        personList.add(new Person("Draupadi",33,"Backend Developer"));
        personList.add(new Person("Krishna",101,"Tester"));
        return personList;
    }
}
