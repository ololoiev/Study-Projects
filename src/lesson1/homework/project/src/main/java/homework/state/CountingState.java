package homework.state;


import homework.ArrayWrapper;
import homework.ArrayWrappers;

public class CountingState implements State{
    private ArrayWrapper arrayWrapper;

    public CountingState(ArrayWrapper arrayWrapper) {
        this.arrayWrapper = arrayWrapper;
    }


    private enum MenuEnum{
        CHOICE_0{
            @Override
            public boolean choice(ArrayWrapper arr){
                System.out.println("1 Найти максимум \n" +
                        "2 Найти минимум\n" +
                        "3 Найти количество\n" +
                        "4 Найти сумму значений\n" +
                        "5 Найти среднее\n" +
                        "6 Назад\n" +
                        "Выберите значение...");
                return true;
            }
        },

        CHOICE_1{
            @Override
            public boolean choice(ArrayWrapper wrapper){
                System.out.println("Максимальное значение: " + ArrayWrappers.findMaxValue(wrapper));
                return true;
            }
        },

        CHOICE_2{
            @Override
            public boolean choice(ArrayWrapper wrapper){
                System.out.println("Минимальное значение: " + ArrayWrappers.findMinValue(wrapper));
                return true;
            }
        },

        CHOICE_3{
            @Override
            public boolean choice(ArrayWrapper wrapper){
                System.out.println("Всего значений: " + ArrayWrappers.findAmount(wrapper));
                return true;
            }
        },

        CHOICE_4{
            @Override
            public boolean choice(ArrayWrapper wrapper){
                System.out.println("Сумма значений: " + ArrayWrappers.getValuesSum(wrapper));
                return true;
            }
        },

        CHOICE_5{
            @Override
            public boolean choice(ArrayWrapper wrapper){
                System.out.println("Арифметическое среднее: " + ArrayWrappers.getAverage(wrapper));
                return true;
            }
        },

        CHOICE_6{
            @Override
            public boolean choice(ArrayWrapper wrapper){
                wrapper.setState(wrapper.getOperationsState());
                return true;
            }
        };

        public abstract boolean choice(ArrayWrapper arr);
    }

    public boolean setChoice(int choice) {
        if(MenuEnum.values().length > choice){
            return MenuEnum.values()[choice].choice(arrayWrapper);
        }
        return false;
    }
}
