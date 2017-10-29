package lesson1.homework.states;


import lesson1.homework.ArrayWrapper;

public class MainMenuState implements State {
    private ArrayWrapper arrayWrapper;

    public MainMenuState(ArrayWrapper arrayWrapper) {
        this.arrayWrapper = arrayWrapper;
    }


    private enum MainMenuEnum{
        CHOICE_0{
            @Override
            public boolean choice(ArrayWrapper arr){
                System.out.println("1. Операции по вычислению\n" +
                        "2. Печать\n" +
                        "3. Выход\n" +
                        "Выберите значение...");
                return true;
            }
        },

        CHOICE_1{
            @Override
            public boolean choice(ArrayWrapper arr){
                arr.setState(arr.getOperationsState());
                return true;
            }
        },

        CHOICE_2{
            @Override
            public boolean choice(ArrayWrapper arr){
                arr.setState(arr.getPrintState());
                return true;
            }
        },

        CHOICE_3{
            @Override
            public boolean choice(ArrayWrapper arr){
                System.exit(0);
                return true;
            }
        };

        public abstract boolean choice(ArrayWrapper arr);
    }

    @Override
    public boolean setChoice(int choice) {
        return MainMenuEnum.values().length > choice && MainMenuEnum.values()[choice].choice(arrayWrapper);
    }
}




