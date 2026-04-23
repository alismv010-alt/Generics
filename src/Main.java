import Cars.BMW;
import Cars.Merc;

public class Main {
    public static void main (String[] args) {
        BMW bmw = new BMW();
        Merc merc = new Merc();
        MyCar<BMW> mybmw = new MyCar<>(bmw);
        MyCar<Merc> mymerc = new MyCar<>(merc);
        BMW car1 = mybmw.getcar();
        Merc car2 = mymerc.getcar();
    }
}
