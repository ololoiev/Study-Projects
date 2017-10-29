package lesson2.classwork.object;

import lesson2.classwork.Testable;

import java.util.Map;

public class CarMapTest implements Testable {

    private Car[] cars = {new Car(1, "Ferary", 1.7),
            new Car(2, "BMW", 2.6),
            new Car(3, "Ferary", 1.4)};

    private Map<String, Car> testMap;

    public CarMapTest(Map<String, Car> testMap) {
        this.testMap = testMap;
    }

    @Override
    public void test() {
        addValuesToList(cars);
        printMapEntrie(testMap);
    }

    private void addValuesToList(Car[] cars) {
        for(int i = 0; i < cars.length; i++){
            testMap.put(cars[i].getName(), cars[i]);
        }

    }

    private void printMapEntrie(Map<String, Car> map){
        System.out.println("\nMap output");
        for(Map.Entry<String, Car> entry: map.entrySet()){
            System.out.println("Item: " + entry.getValue());
        }
        System.out.println("Size: " + map.size());
        System.out.println("Length: " + cars.length);
    }
}
