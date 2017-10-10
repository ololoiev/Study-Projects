package lesson1.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        ArrayWrapper arrayWrapper = createArrayWrapper();

        while (true){
            System.out.println();
            arrayWrapper.setChoice(0);
            System.out.println();
            arrayWrapper.setChoice(ArrayWrappers.getNumber());
        }

    }

    private static ArrayWrapper createArrayWrapper(){
        System.out.println("Введите не больше 10 целых уникальных чисел, когда закончите введите пустую строку.");

        ArrayWrapperBuilder builder = new ArrayWrapperBuilder();
        String value = getValue();
        while (!value.equals("") &&
                builder.getPlenum() < builder.MAX_PLENUM){
            builder.addValue(Integer.parseInt(value));
            value = getValue();
        }

        System.out.println("Ввод чисел закончен, спасибо.");

        return builder.create();
    }



    private static String getValue(){
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while (true){
            try {
                line = bf.readLine();
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
}
