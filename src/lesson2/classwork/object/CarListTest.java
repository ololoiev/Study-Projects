package lesson2.classwork.object;

import lesson2.classwork.Testable;

import java.util.List;

public class CarListTest implements Testable{

    private Car[] cars = {new Car(1, "Ferary", 1.7),
                            new Car(2, "BMW", 2.6),
                            new Car(3, "Ferary", 1.4)};

    private List list;

    public CarListTest(List list) {
        this.list = list;
    }

    @Override
    public void test() {
        addValuesToList(cars);
        printListEntrie(list);
    }

    private void printListEntrie(List list){
        System.out.println("\nList output");
        for (int i = 0; i< list.size(); i++){
            System.out.println("Entry #" + i + ": " + list.get(i));
        }
        System.out.println("Array length: " + cars.length);
        System.out.println("List size: " + list.size());
    }

    private void addValuesToList(Car[] cars){
        for(int i = 0; i < cars.length; i++){
            list.add(cars[i]);
        }
    }


}
