import java.util.*;

public class Hash {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList(new String[]{"a", "b", "c", "a"}));
        HashSet<String> set = new HashSet();
        for(String a : list) {
            set.add(a);
            if(set.add(a)){ // 불리언이니 이렇게 해서 할수있음
                System.out.println(a + "was added!");
            }else{
                System.out.println(a + "was not added");
            }
        }
        "".toString();

        String a = new ArrayList<>().toString(); //리모컨 없음



        System.out.println(set);

        List list2 = new ArrayList();
        for(int b = 0; b < list.size(); b++){
            list2.add(2);
            System.out.println (list2.add(b)); //이거 왜 다 트루로 나오는지 고민해보기

        }
    }
}