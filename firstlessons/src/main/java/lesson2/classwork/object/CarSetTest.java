package lesson2.classwork.object;

import lesson2.classwork.Testable;

import java.util.Arrays;
import java.util.Set;

public class CarSetTest implements Testable {

    private Car[] cars = {new Car(1, "Ferary", 1.7),
            new Car(2, "BMW", 2.6),
            new Car(3, "Ferary", 1.4)};
    private Set set;

    public CarSetTest(Set<Car> set) {
        this.set = set;
    }

    @Override
    public void test() {
        addValuesToList(cars);
        printMapEntrie(set);
    }

    private void printMapEntrie(Set<Car> set) {
        System.out.println("\nSet output");
        for (int i = 0; i< set.size(); i++){
            System.out.println("Entry #" + i + ": " + set.toArray()[i]);
        }
        System.out.println("Array length: " + cars.length);
        System.out.println("Set size: " + set.size());
    }

    private void addValuesToList(Car[] cars) {

       set.addAll(Arrays.asList(cars));
    }


}
