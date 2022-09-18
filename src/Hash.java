import java.util.*;

public class Hash {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList(new String[]{"a", "b", "c", "a"}));
        HashSet<String> set = new HashSet();
        for(String a : list) {
            set.add(a);
        }
        System.out.println(set);

        List list2 = new ArrayList();
        for(int b = 0; b < list.size(); b++){
            System.out.println (list2.add(b)); //이거 왜 다 트루로 나오는지 고민해보기

        }
    }
}