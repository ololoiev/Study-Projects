package lesson1.homework.states;

import lesson1.homework.ArrayWrapper;

public class OperationsState implements State{
    private ArrayWrapper arrayWrapper;

    public OperationsState(ArrayWrapper arrayWrapper) {
        this.arrayWrapper = arrayWrapper;
    }

    private enum MenuEnum{
        CHOICE_0{
            @Override
            public boolean choice(ArrayWrapper arr){
                System.out.println("1 Вычисления значений\n" +
                        "2 Поиск\n" +
                        "3 Назад\n" +
                        "Выберите значение...");
                return true;
            }
        },

        CHOICE_1{
            @Override
            public boolean choice(ArrayWrapper wrapper){
                wrapper.setState(wrapper.getCountingState());
                return true;
            }
        },

        CHOICE_2{
            @Override
            public boolean choice(ArrayWrapper wrapper){
                wrapper.setState(wrapper.getSearchState());
                return true;
            }
        },

        CHOICE_3{
            @Override
            public boolean choice(ArrayWrapper wrapper){
                wrapper.setState(wrapper.getMainMenuState());
                return true;
            }
        };

        public abstract boolean choice(ArrayWrapper arr);
    }

    @Override
    public boolean setChoice(int choice) {
        return MenuEnum.values().length > choice && MenuEnum.values()[choice].choice(arrayWrapper);
    }
}
