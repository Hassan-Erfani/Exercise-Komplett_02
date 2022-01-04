package oop;

public class GenderAnalyzer extends PersonAnalyzer{


    @Override
    public void analyze() {
        int mSize = 0;
        int wSize = 0;
        int mCount = 0;
        int wCount = 0;
        for (Person person : getPersons()) {
            if (person.getGender() == 'M') {
                mSize += person.getSize();
                mCount++;
            } else {
                wSize += person.getSize();
                wCount++;
            }
        }
        System.out.println("In der Liste existieren " +  mCount +  " Männer mit einer durchschnittlichen Körpergröße von " + (mSize / mCount) + " cm.");
        System.out.println("In der Liste existieren " + wCount + " Frauen mit einer durchschnittlichen Körpergröße von " + (wSize / wCount) + " cm.");
    }
}
