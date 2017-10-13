package lesson2.classwork.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class StringMapTest implements Testable {

    private String[] array = {"Ferrary" , "BMW", "Ferrary"};

    private Map<String, Integer> testMap = new HashMap<String, Integer>();

    @Override
    public void test() {
        addValuesToList(array);
        printMapEntrie(testMap);
    }

    private void addValuesToList(String[] array) {
        for (String s: array
             ) {
            testMap.put(s, s.hashCode());
        }
    }

    private void printMapEntrie(Map<String, Integer> map){
        for (Map.Entry<String, Integer> entry: map.entrySet()
             ) {
            System.out.println("Item: " + entry.getKey() + ", number: " + entry.getValue());
        }
        System.out.println("Size: " + map.size());
        System.out.println("Length: " + array.length);
    }
}
