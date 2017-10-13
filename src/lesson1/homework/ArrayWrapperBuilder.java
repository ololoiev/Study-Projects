package lesson1.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayWrapperBuilder {

    public static final Integer MAX_PLENUM = 10;
    private int[] arr = new int[MAX_PLENUM];
    private int plenum = 0;
    private BufferedReader bufferedReader;

    public ArrayWrapperBuilder(BufferedReader bufferedReader) {
        this.bufferedReader = bufferedReader;
    }

    private boolean addValue(int value){
        if(plenum < MAX_PLENUM) {
            if (checkValue(value)) {
                arr[plenum] = value;
                plenum++;
                return true;
            } else {
                System.out.println("Это значение уже было");
                return false;
            }
        }else {
            System.out.println("Значений достаточно.");
            return false;
        }
    }

    public ArrayWrapper createArrayWrapper(){
        System.out.println("Введите не больше 10 целых уникальных чисел, когда закончите введите пустую строку.");

        ArrayWrapperBuilder builder = new ArrayWrapperBuilder(bufferedReader);
        String value = getValue();
        while (!value.equals("") &&
                builder.getPlenum() < ArrayWrapperBuilder.MAX_PLENUM){
            builder.addValue(Integer.parseInt(value));
            value = getValue();
        }

        System.out.println("Ввод чисел закончен, спасибо.");

        return builder.create();
    }

    private String getValue(){
        String line;
            while (true){
                try {
                    line = bufferedReader.readLine();
                    if(line.equals("")){
                        return line;
                    }
                    Integer.parseInt(line);
                    return line;
                }catch (IOException e){
                    e.printStackTrace();
                }catch (NumberFormatException e){
                    System.out.println("Введиие целое число или пустую строку");
                }
            }
    }

    private boolean checkValue(int value){
        for(int i = 0; i < plenum; i++){
            if(value == arr[i]) {
                return false;
            }
        }
        return true;
    }

    public ArrayWrapper create(){
        return new ArrayWrapper(createArray());
    }

    private int[] createArray(){
        if(plenum == MAX_PLENUM){
            return arr;
        }else {
            int[] resultArray = new int[plenum];
            for (int i = 0; i < plenum; i++){
                resultArray[i] = arr[i];
            }
            return resultArray;
        }
    }

    public int getPlenum() {
        return plenum;
    }
}
