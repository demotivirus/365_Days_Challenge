package com.demotivirus.Day_152;

import com.demotivirus.Day_152.constants.Gender;
import com.demotivirus.Day_152.constants.MaritalStatus;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Mikle", Gender.MALE, MaritalStatus.MARRIED));
        persons.add(new Person("Jhon", Gender.MALE, MaritalStatus.SINGLE));
        persons.add(new Person("Thomas", Gender.MALE, MaritalStatus.IN_ACTIVE_SEARCH));
        persons.add(new Person("Diana", Gender.FEMALE, MaritalStatus.MARRIED));
        persons.add(new Person("Beatris", Gender.FEMALE, MaritalStatus.IN_ACTIVE_SEARCH));
        persons.add(new Person("Anna", Gender.FEMALE, MaritalStatus.SINGLE));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria or = new CriteriaOr(single, male);
        Criteria and = new CriteriaAnd(single, female);

        System.out.println("Males: ");
        printPersons(male.meetCriteria(persons));

        System.out.println("\nFemales: ");
        printPersons(female.meetCriteria(persons));

        System.out.println("\nSingle Males: ");
        printPersons(single.meetCriteria(persons));

        System.out.println("\nSingle Or Females: ");
        printPersons(or.meetCriteria(persons));;
    }

    public static void printPersons(List<Person> persons){

        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName() + ", Gender : " + person.getGender() + ", Marital Status : " + person.getMaritalStatus() + " ]");
        }
    }
}
