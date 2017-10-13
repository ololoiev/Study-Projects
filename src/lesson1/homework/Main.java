package lesson1.homework;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in));
        ArrayWrapper arrayWrapper =
                new ArrayWrapperBuilder(bufferedReader)
                .createArrayWrapper();

        while (true){
            System.out.println();
            arrayWrapper.setChoice(0);
            System.out.println();
            arrayWrapper.setChoice(ArrayWrappers.getNumber());
        }

    }

}
