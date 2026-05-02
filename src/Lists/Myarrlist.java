package Lists;

import java.util.Arrays;
import java.util.List;

public class Myarrlist <T>  {
    private Object[] array = new Object[100];
    int i=0;
    public void add (T pram) {
        if (i==array.length) {
            Object[] copyofarray = Arrays.copyOf(array, array.length/2);
            this.array=copyofarray;
        }
        array[++i]=pram;
    }
    public T get (int a) {
        return (T) array[i];
    }

}
