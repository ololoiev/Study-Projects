package lesson1.homework.project.src.main.java.homework.state;


import homework.ArrayWrapper;
import homework.ArrayWrappers;

public class PrintState implements State{
    private ArrayWrapper arrayWrapper;

    public PrintState(ArrayWrapper arrayWrapper) {
        this.arrayWrapper = arrayWrapper;
    }

    private enum MenuEnum{
        CHOICE_0{
            @Override
            public boolean choice(ArrayWrapper arr){
                System.out.println("1 Печать массива в прямом порядке\n" +
                                "2 Печать массива в обратном порядке\n" +
                                "3 Печать массива в отсортированном порядке\n" +
                                "4 Назад\n" +
                        "Выберите значение...");
                return true;
            }
        },

        CHOICE_1{
            @Override
            public boolean choice(ArrayWrapper wrapper){
                ArrayWrappers.print(wrapper);
                return true;
            }
        },

        CHOICE_2{
            @Override
            public boolean choice(ArrayWrapper wrapper){
                ArrayWrappers.reversPrint(wrapper);
                return true;
            }
        },

        CHOICE_3{
            @Override
            public boolean choice(ArrayWrapper wrapper){
                ArrayWrappers.sortedPrint(wrapper);
                return true;
            }
        },

        CHOICE_4{
            @Override
            public boolean choice(ArrayWrapper arr) {
                arr.setState(arr.getMainMenuState());
                return true;
            }
        };

        public abstract boolean choice(ArrayWrapper arr);
    }

    public boolean setChoice(int choice) {
        return MenuEnum.values().length > choice && MenuEnum.values()[choice].choice(arrayWrapper);
    }
}
