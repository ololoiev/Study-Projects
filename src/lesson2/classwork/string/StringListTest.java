package lesson2.classwork.string;

import lesson2.classwork.Testable;

import java.util.LinkedList;
import java.util.List;

public class StringListTest implements Testable {

    private String[] array = {"Ferrary" , "BMW"};

    private List list = new LinkedList();


    @Override
    public void test() {
        addValuesToList(array);
        printListEntrie(list);
    }

    private void printListEntrie(List list){
        for (int i = 0; i< list.size(); i++){
            System.out.println("Entry #" + i + ": " + list.get(i));
        }
        System.out.println("Array length: " + array.length);
        System.out.println("List size: " + list.size());
    }

    private void addValuesToList(String[] array){
        for(String s : array){
            list.add(s);
        }
    }
}
