import java.util.ArrayList;
import java.util.List;

public class ListClass {
    public static void main(String[] args) {
        //arraylist.add(1);
        int[] arraylist = new int[1]; // array 처럼 접근 해야하나??
        arraylist[0] =1;
        //arraylist.add(2);
        int[] arraylist2 = new int[arraylist.length+1];
        for(int i = 0; i< arraylist.length; i++){
            arraylist2[i] = arraylist[i];
        }
        arraylist2[arraylist.length+1] = 2;
        //arraylist.add(3);
        int[] arraylist3 = new int[arraylist2.length+1];
        arraylist3[0] = arraylist2[0];
        arraylist3[1] = arraylist2[1];
        arraylist3[arraylist2.length+1] = 3;


        //linkedlist.add(1);
        LinkNode linkNode = new LinkNode(1);
        //linkedlist.add(2);
        LinkNode linkNode2 = new LinkNode(2);
        linkNode.nextNode = linkNode2;
        //linkedlist.add(3);
        LinkNode linkNode3 = new LinkNode(3);
        linkNode2.nextNode = linkNode3;

    }
}
