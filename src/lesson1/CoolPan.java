package lesson1;

public class CoolPan extends Pan{
    public CoolPan(int times) {
        super(times);
    }

    public CoolPan() {
    }

    @Override
    public void write(String s) {
        System.out.println("I wrote infinet: " +s);
    }
}
