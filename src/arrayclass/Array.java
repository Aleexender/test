package arrayclass;

import java.util.ArrayList;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[3];
        array[0] = 3;
        array[2] = 2;
//        array[3] = 1;

        String[] a = new String[6];
        a[0] = "AbCD";
        a[1] = "EFG";
        a[2] = "abcd";
        a[3] = "efg";
        a[4] = "alex";
        a[5] = "king";
        System.out.println(String.valueOf(a));
        List<Double> ashit = new ArrayList();
        ashit.add(3.0);
        ashit.add(4.0);
        ashit.add(1.0);
        ashit.add(4.2);
        System.out.println(ashit);
    }
}
