package lesson2.homework;

import java.util.*;
import java.util.stream.Collectors;

import static lesson2.homework.ListMethods.getList;

public class MapMethods {
    public static Map<String, TestObject> deleteMaxValues(Map<String, TestObject> map){
        int maxValue = Integer.MIN_VALUE;
        for(TestObject object: map.values()){
            int value = object.getValue();
            if (value>maxValue){
                maxValue = value;
            }
        }
        Map<String, TestObject> newMap = new HashMap<>();
        for (Map.Entry node : map.entrySet()) {
            TestObject object = (TestObject)node.getValue();
            if (object.getValue() != maxValue) {
                newMap.put(object.getName(), object);
            }
        }
        return newMap;
    }

    public static Map<String, TestObject> streamDeleteMaxValues(Map<String, TestObject> map){
        return map.entrySet().stream()
                .filter(testObject -> testObject.getValue().getValue()!=findMax(map))
                .collect(Collectors.toMap(o -> o.getKey(), o->o.getValue()));
    }

    private static int findMax(Map<String, TestObject> map){
        return map.entrySet().stream()
                .mapToInt(y -> y.getValue().getValue())
                .max().getAsInt();
    }

    public static Map<String, TestObject> deleteLessThan(Map<String, TestObject> map, int value){
        Map<String, TestObject> newMap = new HashMap<String, TestObject>();
        for (TestObject object : map.values()) {
            if (object.getValue() >= value) {
                newMap.put(object.getName(),object);
            }
        }
        return newMap;
    }

    public static Map<String, TestObject> streamDeleteLessThan(Map<String, TestObject> map, int value) {
        return map.entrySet().stream()
                .filter(o -> o.getValue().getValue() >= value)
                .collect(Collectors.toMap(o -> o.getKey(), o->o.getValue()));
    }

    public static int valuesSum(Map<String, TestObject> map){
        int sum = 0;
        for(TestObject object : map.values()){
            sum += object.getValue();
        }
        return sum;
    }

    public static int streamValuesSum(Map<String, TestObject> map){
        return map.values().stream()
                .mapToInt(TestObject::getValue)
                .sum();
    }

    public static TestObject getThirdElement(Map<String, TestObject> map){
        TreeMap<String, TestObject> newMap = new TreeMap<String, TestObject>(map);
        return (TestObject) newMap.values().toArray()[2];
    }

    public static TestObject streamGetThirdElement(Map<String, TestObject> map){
        return map.values().stream()
                .sorted((a,b) -> a.getName().compareTo(b.getName()))
                .skip(2)
                .limit(1)
                .findFirst()
                .get();
    }

    public static Map<String, TestObject> getSecondAndThirdElements(Map<String, TestObject> map) {
        TreeMap<String, TestObject> newMap = new TreeMap<String, TestObject>(map);
        TestObject second = (TestObject) newMap.values().toArray()[1];
        TestObject third = (TestObject) newMap.values().toArray()[2];
        HashMap<String, TestObject> rMap = new HashMap<String, TestObject>();
        rMap.put(second.getName(), second);
        rMap.put(third.getName(), third);
        return rMap;
    }

    public static Map<String, TestObject> streamGetSecondAndThirdElements(Map<String, TestObject> map){
        return map.entrySet().stream()
                .sorted((a,b) -> a.getValue().getName().compareTo(b.getValue().getName()))
                .skip(1)
                .limit(2)
                .collect(Collectors.toMap(o -> o.getKey(), o->o.getValue()));
    }

    public static Map<String, TestObject> choosePatternElements(Map<String, TestObject> map){
        Map<String, TestObject> newMap = new HashMap<>();
        for(TestObject object: map.values()){
            if (object.getValue() > 2
                    && object.getValue() < 100
                    && object.getName().length() > 3){
                newMap.put(object.getName(), object);
            }
        }
        return newMap;
    }

    public static Map<String, TestObject> streamChoosePatternElements(Map<String, TestObject> map){
        return map.values().stream()
                .filter(testObject -> testObject.getValue() > 2)
                .filter(testObject -> testObject.getValue() < 100)
                .filter(testObject -> testObject.getName().length() > 3)
                .collect(Collectors.toMap(o -> o.getName(), o->o));
    }

    public static boolean isNameHaveLetter(Map<String, TestObject> map, Character c){
        for (TestObject object: map.values()){
            if(object.getName().indexOf(c) == -1){
                return false;
            }
        }
        return true;
    }

    public static boolean streamIsNameHaveLetter(Map<String, TestObject> map, Character c){
        return map.values().stream()
                .allMatch(testObject -> testObject.getName().indexOf(c) != -1);
    }

    public static void add_1(Map<String, TestObject> map) {
        for(TestObject object: map.values()){
            object.setName(object.getName()+"_1");
        }

    }

    public static void streamAdd_1(Map<String, TestObject> map){
        map.values().stream()
                .forEach(testObject -> testObject.setName(testObject.getName()+"_1"));
    }

    public static Map<String, TestObject> hardSort(Map<String, TestObject> map){
        List<TestObject> list = new  ArrayList<TestObject>();
        for (TestObject object: map.values()){
            list.add(object);
        }
        ListMethods.hardSort(list);
        map = new LinkedHashMap<String, TestObject>();
        for (TestObject object : list) {
            map.put(object.getName(), object);
        }
        return map;
    }

    public static Map<String, TestObject> streamHardSort(Map<String, TestObject> map) {
        return map.values().stream()
                .sorted(Comparator.comparing(TestObject::getName))
                .sorted(Comparator.comparingInt(TestObject::getValue))
                .collect(Collectors.toMap(o -> o.getName(),
                        o -> o,
                        (v1,v2)->v1,
                        LinkedHashMap::new));
    }


    public static Map<String, TestObject> getMap() {
        return getList().stream()
                .collect(Collectors.toMap(o -> o.getName(), o -> o));
    }
}
