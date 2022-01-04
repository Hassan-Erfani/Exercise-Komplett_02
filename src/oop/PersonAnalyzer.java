package oop;

import java.util.ArrayList;

public abstract class PersonAnalyzer {
    private ArrayList<Person> persons = new ArrayList<>();

    public void setPersons(ArrayList<Person> d) {
        this.persons = d;
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public abstract void analyze();
}
