package oop;

import java.util.ArrayList;

public class BMIAnalyzer extends PersonAnalyzer{
    private ArrayList<Pair<Person, Double>> result = new ArrayList<>();

    @Override
    public void analyze() {
        for (Person person : getPersons()) {
            double bmi = calcBMI(person);
            Pair<Person, Double> pair = new Pair<>(person, bmi);
            result.add(pair);
        }
        System.out.println(result);
    }

    private double calcBMI(Person p) {
        double bmi = p.getWeight() / ((p.getSize() / 100D) * (p.getSize() / 100D));
        return bmi;
    }

    public ArrayList<Pair<Person, Double>> getResult() {
        return result;
    }

    @Override
    public String toString() {
        return "BMIAnalyzer{" +
                "result=" + result +
                '}';
    }
}
