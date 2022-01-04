package oop;

public class MaxSalaryAnalyzer extends PersonAnalyzer {
    @Override
    public void analyze() {
        System.out.println("Persons with high salary:");
        for (Person person : getPersons()) {
            if (person.getSalary() >= 5000) {
                System.out.println(person.getFirstname() + " " + person.getLastname() + ": " + person.getSalary() + "€");
            }
        }
    }
}
