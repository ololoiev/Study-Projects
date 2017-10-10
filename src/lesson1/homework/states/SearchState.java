package lesson1.homework.states;

import lesson1.homework.ArrayWrapper;
import lesson1.homework.ArrayWrappers;

import static lesson1.homework.ArrayWrappers.*;

public class SearchState implements State{
    private ArrayWrapper arrayWrapper;

    public SearchState(ArrayWrapper arrayWrapper) {
        this.arrayWrapper = arrayWrapper;
    }

    private enum MenuEnum{
        CHOICE_0{
            @Override
            public boolean choice(ArrayWrapper arr){
                System.out.println("1 Проверить входит ли число в массив\n" +
                        "2 Заменить элемент массива на другой\n" +
                        "3 Назад\n" +
                        "Выберите значение...");
                return true;
            }
        },

        CHOICE_1{
            @Override
            public boolean choice(ArrayWrapper wrapper){
                System.out.println("Введите проверяемое число:");
                int checkValue = getNumber();
                boolean isContain = ArrayWrappers.isContain(wrapper, checkValue);
                System.out.print("Число " + checkValue );
                if(isContain) {
                    System.out.println(" содержится.");
                }else {
                    System.out.println(" не содержится.");
                }
                return true;
            }
        },

        CHOICE_2{
            @Override
            public boolean choice(ArrayWrapper wrapper){
                System.out.println("Введите заменяющее значение: ");
                int value = getNumber();
                System.out.println("Введите позицию: ");
                int position = getPosition(wrapper);
                return replaceElement(wrapper, value, position);
            }
        },

        CHOICE_3{
            @Override
            public boolean choice(ArrayWrapper wrapper){
                wrapper.setState(wrapper.getOperationsState());
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
