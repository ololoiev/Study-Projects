package lesson2.homework;


import com.sun.xml.internal.bind.v2.TODO;

import java.util.*;
import java.util.stream.Collectors;

public class ListMethods {
    public static List<TestObject> deleteMaxValues(List<TestObject> list){
        int maxValue = Integer.MIN_VALUE;
        for(int i = 0; i < list.size(); i++){
            int value = list.get(i).getValue();
            if (value>maxValue){
                maxValue = value;
            }
        }
        List<TestObject> newList = new ArrayList<>();
        for (TestObject object : list) {
            if (object.getValue() != maxValue) {
                newList.add(object);
            }
        }
        return newList;
    }

    public static List<TestObject> streamDeleteMaxValues(List<TestObject> list){
        return list.stream()
                .filter(testObject -> testObject.getValue()!=findMax(list))
                .collect(Collectors.toList());
    }

    public static List<TestObject> deleteLessThan(List<TestObject> list, int value){
        List<TestObject> newList = new ArrayList<>();
        for (TestObject object : list) {
            if (object.getValue() >= value) {
                newList.add(object);
            }
        }
        return newList;
    }

    public static List<TestObject> streamDeleteLessThan(List<TestObject> list, int value) {
        return list.stream()
                .filter(o -> o.getValue() >= value)
                .collect(Collectors.toList());
    }

    private static int findMax(List<TestObject> list){
        return list.stream()
                .mapToInt(TestObject::getValue)
                .max().getAsInt();
    }

    public static int valuesSum(List<TestObject> list){
        int sum = 0;
        for(TestObject object : list){
            sum += object.getValue();
        }
        return sum;
    }

    public static int streamValuesSum(List<TestObject> list){
        return list.stream()
                .mapToInt(TestObject::getValue)
                .sum();
    }

    public static TestObject getThirdElement(List<TestObject> list){
        return list.get(2);
    }

    public static TestObject streamGetThirdElement(List<TestObject> list){
        return list.stream()
                .skip(2)
                .limit(1)
                .findFirst()
                .get();
    }

    public static ArrayList<TestObject> getSecondAndThirdElements(List<TestObject> list) {
        return new ArrayList<TestObject>
                (Arrays.asList(
                        list.get(1),
                        list.get(2)));
    }

    public static List<TestObject> streamGetSecondAndThirdElements(List<TestObject> list){
        return list.stream()
                .skip(1)
                .limit(2)
                .collect(Collectors.toList());
    }

    public static ArrayList<TestObject> choosePatternElements(List<TestObject> list){
        ArrayList<TestObject> newList = new ArrayList<>();
        for(TestObject object: list){
            if (object.getValue() > 2
                    && object.getValue() < 100
                    && object.getName().length() > 3){
                newList.add(object);
            }
        }
        return newList;
    }

    public static List<TestObject> streamChoosePatternElements(List<TestObject> list){
        return list.stream()
                .filter(testObject -> testObject.getValue() > 2)
                .filter(testObject -> testObject.getValue() < 100)
                .filter(testObject -> testObject.getName().length() > 3)
                .collect(Collectors.toList());
    }

    public static boolean isNameHaveLetter(List<TestObject> list, Character c){
        for (TestObject object: list){
            if(object.getName().indexOf(c) == -1){
                return false;
            }
        }
        return true;
    }

    public static boolean streamIsNameHaveLetter(List<TestObject> list, Character c){
        return list.stream()
                .allMatch(testObject -> testObject.getName().indexOf(c) != -1);
    }

    public static void add_1(List<TestObject> list) {
        for(TestObject object: list){
            object.setName(object.getName()+"_1");
        }

    }

    public static void streamAdd_1(List<TestObject> list){
        list.stream()
                .forEach(testObject -> testObject.setName(testObject.getName()+"_1"));
    }

    public static void hardSort(List<TestObject> list){
        Collections.sort(list, new Comparator<TestObject>() {
            @Override
            public int compare(TestObject o1, TestObject o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        Collections.sort(list, new Comparator<TestObject>() {
            @Override
            public int compare(TestObject o1, TestObject o2) {
                return o1.getValue()-o2.getValue();
            }
        });
    }

    public static List<TestObject> streamHardSort(List<TestObject> list) {
        return list.stream()
                .sorted(Comparator.comparing(TestObject::getName))
                .sorted(Comparator.comparingInt(TestObject::getValue))
                .collect(Collectors.toList());
    }

    public static List<TestObject> getList() {
        return Arrays.asList(new TestObject("Kred", 5),
                new TestObject("Ards", 1),
                new TestObject("Tr", 5),
                new TestObject("Mordor", 101),
                new TestObject("Dord", 5),
                new TestObject("Ewarde", 9),
                new TestObject("Taer", 101));
    }

}

