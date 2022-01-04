package oop;

import java.util.ArrayList;

public class PersonManager extends Person{
    private ArrayList<Person> d = new ArrayList<>();
    public PersonManager(String firstname, String lastname, char gender, int age, String country, int salary, String eyeColor, int weight, int size) {
        super(firstname, lastname, gender, age, country, salary, eyeColor, weight, size);
    }

    public void add(Person p) {
        d.add(p);
    }

    public void doAnalysis(PersonAnalyzer a) {
        a.setPersons(d);
        a.analyze();
    }

    public ArrayList<Person> getD() {
        return d;
    }

    @Override
    public String toString() {
        return "PersonManager{" +
                "d=" + d +
                '}';
    }
}
