package lesson2.classwork;


import lesson2.classwork.object.CarListTest;
import lesson2.classwork.object.CarMapTest;
import lesson2.classwork.object.CarSetTest;

import java.util.*;

public class Main {

    private static Testable[] testables = {
            new CarListTest(new ArrayList()),
            new CarListTest(new LinkedList()),

            new CarSetTest(new HashSet()),
            new CarSetTest(new TreeSet()),

            new CarMapTest(new HashMap<>()),
            new CarMapTest(new LinkedHashMap<>()),
            new CarMapTest(new TreeMap<>(new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o1.compareTo(o2);
                }
            }))
    } ;

    public static void main(String[] args) {

        for(Testable testable: testables) {
            testable.test();
        }
    }
}
