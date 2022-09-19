package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PracticeTest {


    List<String> list = new ArrayList<>(Arrays.asList(new String[]{"a", "b", "c", "a"}));
    List list2 = new ArrayList();

    public int sad(String a) {
        System.out.println("i am really " + a);
        if ("".equals(a)) { // 이렇게 리턴값을 돌려줌으로써 void 역할을 할수있음
            return 1;
        }
        return 0;
    }
    public String toString(){
        return list2.toString(); // toString() 괄호 안에 뭐를 넣을수있을까? 앞에 있는거에 따라 달라질거같은데
    }
    public void checking(){
        Integer test = 0;
        test.toString(12);
//        String ts = "a";
//        ts.toString("as"); //
        Boolean as = true;
        as.toString(false);
//        int ts2 = 10;
//        ts2.toString();


    }

}
