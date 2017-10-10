package homework;

public class ArrayWrapperBuilder {

    public static final Integer MAX_PLENUM = 10;
    private int[] arr = new int[MAX_PLENUM];
    private int plenum = 0;

    public boolean addValue(int value){
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
