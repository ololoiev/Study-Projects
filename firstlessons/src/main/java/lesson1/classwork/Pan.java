package lesson1.classwork;

public class Pan extends WriteObject{
    private int times = 100;

    public Pan() {
    }

    public Pan(int times) {
        this.times = times;
    }

    @Override
    public void write(String s) {
        if(times>0) {
            System.out.println("I wrote: " + s);
        }else{
            System.out.println("I cant wrote.");
        }
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }
}
