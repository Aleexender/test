package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PracticeTest {


    List<String> list = new ArrayList<>(Arrays.asList(new String[]{"a", "b", "c", "a"}));
    List list2 = new ArrayList();

    public int sad() {


        for (int b = 0; b < list.size(); b++) {
            System.out.println(list2.add(b));//이거 왜 다 트루로 나오는지 고민해보기
            System.out.println(list2.toString());


        }
        return 0;
    }
    public String toString(){
        return list2.toString();
    }

}
