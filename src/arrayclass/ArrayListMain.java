package arrayclass;

import java.util.ArrayList;

public class ArrayListMain {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(2);
        arrayList.add(1);
        arrayList.add(3);

        arrayList.add(1,100);
        for(int i : arrayList){
            System.out.println(i);
        }
    }
}
