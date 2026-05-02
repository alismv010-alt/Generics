package Map;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main (String[] args) {
        Map<Integer, String> students = new HashMap<>();
        students.put(1,"Semaye");
        students.put(5, "Nushabe");
        students.put(10,"Furkhan");



        String name1 = students.get(5);
        String name2 = students.get(10);
        System.out.println(name1);
        System.out.println(name2);



    }
}
