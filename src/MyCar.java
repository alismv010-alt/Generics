import Cars.AbstrCar;

public class MyCar <Type extends AbstrCar> {
    private final Type car;

    public MyCar(Type car) {
        this.car=car;
    }
    public Type getcar() {
        return car;
    }
    public void drive() {
        car.drive();
    }
}
