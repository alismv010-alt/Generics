import Cars.AbstrCar;
import Cars.BMW;
import Cars.Merc;
import Generics.MyCar;
import Generics.MyCar2;

public class Main {
    public static void main (String[] args) {

        MyCar<Integer> mycars = new MyCar<>();
        foo(mycars);
    }
    public static void foo (MyCar <Integer> pram) {
      pram.getcar();

    }
}
