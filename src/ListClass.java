import java.util.ArrayList;
import java.util.List;

public class ListClass {
    public static void main(String[] args) {
        List list = new ArrayList(); // 왔다 갔다 가능
        list.add(1);
        list.add(3);
        list.add(2);
        List list2 = list;
        list2.add(4);
        System.out.println(list);
    }
}
