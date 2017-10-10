package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArrayWrappers {
    public static void print(ArrayWrapper wrapper){
        for (int value : wrapper.getArray()) {
            System.out.println(value);
        }
    }

    public static void reversPrint(ArrayWrapper wrapper){
        int[] array = wrapper.getArray();
        for (int i = array.length-1; i>=0; i--){
            System.out.println(array[i]);
        }
    }

    public static void sortedPrint(ArrayWrapper wrapper){
        int[] array = wrapper.getNewArray();
        Arrays.sort(array);
        for(int i : array){
            System.out.println(i);
        }
    }

    public static boolean isContain(ArrayWrapper wrapper, int value){
        int[] array = wrapper.getArray();
        for(int i: array){
            if(i == value){
                return true;
            }
        }
        return false;
    }

    public static boolean replaceElement(ArrayWrapper wrapper, int value, int position){
        int[] array = wrapper.getArray();
        array[position] = value;
        return true;
    }

    public static int getNumber(){
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int value;
        String line;
        while (true){
            try {
                line = bf.readLine();
                value = Integer.parseInt(line);
                return value;
            }catch (IOException e){
                e.printStackTrace();
            }catch (NumberFormatException e){
                System.out.println("Введиие целое число:");
            }
        }
    }

    public static int getPosition(ArrayWrapper wrapper){
        int position;
        int maxPosition = wrapper.getArray().length;
        while (true){
            position = getNumber();
            if(position < maxPosition && position >= 0){
                return position;
            }else{
                System.out.println("Позиция от 0 и до " + (maxPosition-1));
                System.out.println("Введите значение: ");
            }
        }
    }

    public static int findMaxValue(ArrayWrapper wrapper){
        int maxValue = Integer.MIN_VALUE;
        for (int i : wrapper.getArray()){
            if(i>maxValue){
                maxValue = i;
            }
        }
        return maxValue;
    }

    public static int findMinValue(ArrayWrapper wrapper){
        int minValue = Integer.MAX_VALUE;
        for (int i : wrapper.getArray()){
            if(i<minValue){
                minValue = i;
            }
        }
        return minValue;
    }

    public static int findAmount(ArrayWrapper wrapper){
        return wrapper.getArray().length;
    }

    public static int getValuesSum(ArrayWrapper wrapper){
        int sum = 0;
        for(int i : wrapper.getArray()){
            sum +=i;
        }
        return sum;
    }

    public static double getAverage(ArrayWrapper wrapper){
        return 1. * getValuesSum(wrapper)/findAmount(wrapper);
    }
}
