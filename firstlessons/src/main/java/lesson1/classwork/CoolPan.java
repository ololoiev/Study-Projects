package lesson1.classwork;

public class CoolPan extends Pan{

    public CoolPan() {
    }

    public CoolPan(int times) {
        super(times);
    }

    @Override
    public void write(String s) {
        System.out.println("I wrote infinet: " +s);
    }
}
