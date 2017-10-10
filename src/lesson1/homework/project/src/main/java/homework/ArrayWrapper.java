package homework;


import homework.state.*;

import java.util.Arrays;

public class ArrayWrapper {
    private int[] mass;

    private State state;
    private State mainMenu;
    private State counting;
    private State operations;
    private State print;
    private State search;

    public ArrayWrapper(int[] mass) {
        this.mass = mass;

        mainMenu = new MainMenuState(this);
        counting = new CountingState(this);
        operations = new OperationsState(this);
        print = new PrintState(this);
        search = new SearchState(this);
        state = mainMenu;
    }

    public boolean setChoice(int choice){
        return state.setChoice(choice);
    }

    public int[] getNewArray(){
        int[] arr = new int[mass.length];
        for(int i = 0; i < mass.length; i++){
            arr[i] = mass[i];
        }
        return arr;
    }

    public int[] getArray() {
        return mass;
    }

    public void setArray(int[] mass) {
        this.mass = mass;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getMainMenuState() {
        return mainMenu;
    }

    public State getCountingState() {
        return counting;
    }

    public State getOperationsState() {
        return operations;
    }

    public State getPrintState() {
        return print;
    }

    public State getSearchState() {
        return search;
    }

}
