package lesson2.homework;

import java.util.List;
import java.util.Map;

import static lesson2.homework.ListMethods.*;
import static lesson2.homework.MapMethods.getMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(getList() + "list");

        System.out.println(deleteMaxValues(getList())+"delete Max");
        System.out.println(streamDeleteMaxValues(getList())+"stream delete Max");

        System.out.println(deleteLessThan(getList(), 7));
        System.out.println(streamDeleteLessThan(getList(), 7) + "delete less than 7");

        System.out.println(valuesSum(getList()) + " valuesSum");
        System.out.println(streamValuesSum(getList()) + " streamValuesSum");

        System.out.println(getThirdElement(getList()) + " getThirdElement");
        System.out.println(streamGetThirdElement(getList()) + " streamGetThirdElement");

        System.out.println(getSecondAndThirdElements(getList()) + "getSecondAndThirdElements");
        System.out.println(streamGetSecondAndThirdElements(getList()) + "streamGetSecondAndThirdElements");

        System.out.println(choosePatternElements(getList())+ "pattern choose");
        System.out.println(streamChoosePatternElements(getList()) + "stream pattern choose");

        System.out.println(isNameHaveLetter(getList(), 'r') + " isNameHaveLetter");
        System.out.println(streamIsNameHaveLetter(getList(), 'r') + " streamIsNameHaveLetter");

        List<TestObject> list = getList();
        add_1(list);
        System.out.println(list);
        List<TestObject> list1 = getList();
        streamAdd_1(list1);
        System.out.println(list1);

        list = getList();
        hardSort(list);
        System.out.println(list);
        System.out.println(streamHardSort(getList()) + "streamHardSort");
        System.out.println();
        System.out.println();



        System.out.println(getMap());

        System.out.println(MapMethods.deleteMaxValues(getMap()));
        System.out.println(MapMethods.streamDeleteMaxValues(getMap()) + "delete Max");

        System.out.println(MapMethods.deleteLessThan(getMap(), 7));
        System.out.println(MapMethods.streamDeleteLessThan(getMap(), 7) + "delete less than 7");

        System.out.println(MapMethods.valuesSum(getMap()));
        System.out.println(MapMethods.streamValuesSum(getMap()) + " values Sum");

        System.out.println(MapMethods.getThirdElement(getMap()));
        System.out.println(MapMethods.streamGetThirdElement(getMap())+" third element");

        System.out.println(MapMethods.getSecondAndThirdElements(getMap()));
        System.out.println(MapMethods.streamGetSecondAndThirdElements(getMap()) + " third and second");

        System.out.println(MapMethods.choosePatternElements(getMap()));
        System.out.println(MapMethods.streamChoosePatternElements(getMap()) + "pattern choose");

        System.out.println(MapMethods.isNameHaveLetter(getMap(), 'r') + " isNameHaveLetter");
        System.out.println(MapMethods.streamIsNameHaveLetter(getMap(), 'r') + " streamIsNameHaveLetter");

        Map<String, TestObject> map = getMap();
        MapMethods.add_1(map);
        System.out.println(map);
        Map<String, TestObject> map1 = getMap();
        MapMethods.streamAdd_1(map1);
        System.out.println(map1);

        System.out.println(MapMethods.hardSort(getMap()));
        System.out.println(MapMethods.streamHardSort(getMap()) + "streamHardSort");
    }
}
