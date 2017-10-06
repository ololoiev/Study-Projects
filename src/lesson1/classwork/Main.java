package lesson1.classwork;

public class Main {
   static WriteObject writeable[] = {new Pan(), new CoolPan()};

    public static void main(String[] args) {
        for (Writeable w : writeable){
            w.write("It work!");
        }
    }
}
