package com.company;

import java.util.Arrays;

public class Families {
    private Person[] people;
    private String families;


    public Families(Person[] people, String families) {
        this.people = people;
        this.families = families;
    }

    public Person[] getPeople() {
        return people;
    }

    public void setPeople(Person[] people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "Families{" +
                "" + Arrays.toString(people) +
                ", families='" + families + '\'' +
                '}';
    }

    public void sany() {
        int counter = 0;

        for (int i = 0; i < people.length; i++) {

            counter ++ ;
        }
        System.out.println( counter);

    }
}





