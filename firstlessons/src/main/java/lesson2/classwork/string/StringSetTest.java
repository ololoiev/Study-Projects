package lesson2.classwork.string;

import lesson2.classwork.Testable;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StringSetTest implements Testable {

    private String[] array = {"Ferrary" , "BMW", "Ferrary"};

    private Set set = new HashSet();

    @Override
    public void test() {
        addValuesToList(array);
        printMapEntrie(set);
    }

    private void printMapEntrie(Set set) {
        for (int i = 0; i< set.size(); i++){
            System.out.println("Entry #" + i + ": " + set.toArray()[i]);
        }
        System.out.println("Array length: " + array.length);
        System.out.println("Set size: " + set.size());
    }

    private void addValuesToList(String[] array) {
       set.addAll(Arrays.asList(array));
    }


}
