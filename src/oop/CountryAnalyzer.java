package oop;

import java.util.HashMap;

public class CountryAnalyzer extends PersonAnalyzer{
    private HashMap<String, Integer> result = new HashMap<>();

    @Override
    public void analyze() {
        result.put("AT", 0);
        result.put("DE", 0);
        result.put("CH", 0);
        result.put("SI", 0);
        for (Person person : getPersons()) {

            result.put(person.getCountry(), result.get(person.getCountry()) +1);
        }

        System.out.println(result);
    }

    public HashMap<String, Integer> getResult() {
        return result;
    }
}
