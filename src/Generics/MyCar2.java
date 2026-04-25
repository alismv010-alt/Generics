package Generics;

public class MyCar2 <C,D > {
    private C obj1;
    private D obj2;

    public void setobj_C(C obj1)
    {
        this.obj1=obj1;
    }
    public void setobj_D(D obj2)
    {
        this.obj2=obj2;
    }
    public  C getobj()
    {
        return obj1;
    }
}
