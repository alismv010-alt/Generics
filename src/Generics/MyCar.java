package Generics;

import Cars.AbstrCar;

public class MyCar <T> extends MyCar2<T, String> {
    private T car;


    public T getcar()
    {
        return car;
    }
    public void set(T pram)
    {

    }
}
