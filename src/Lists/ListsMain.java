package Lists;

import java.util.ArrayList;
import java.util.List;

public class ListsMain {
    public static void main (String[] args) {
        /*
        ArrayList<String> arrlist = new ArrayList<>();
        arrlist.add("Vusale");
        arrlist.add("Valeh");
        arrlist.add("Ali");

        for (String aa: arrlist) {
            System.out.println(aa);
        }

         */
        Myarrlist<String> myarr = new Myarrlist<>();
        myarr.add("Valeh");
        myarr.add("Vusale");
        myarr.add("Ali");

        System.out.println(myarr.get(2));
    }
}
