package practice;

import java.util.ArrayList;
import java.util.LinkedList;

public class PracticeArraylist {
    public static void main(String[] args) {
       ArrayList <Integer> arraylist = new ArrayList<Integer>();
       arraylist.add(3);
       arraylist.add(2);


        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        for(int a : linkedList){
            System.out.println(a);
        }
        System.out.println(arraylist);
    }
}
