import java.util.*;

public class Hash {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList(new String[]{"a", "b", "c", "a"}));
        HashSet<String> set = new HashSet();
        for(String a : list) {
            set.add(a);
            if(set.add(a)){ // 불리언을 이용해서 add() 변수에다가 값을 추가해줌
                System.out.println(a + "was added!");  // 리턴을 해서 실행을 같이 해야할때 필요함
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
            System.out.println (list2.add(b)); //이거 왜 다 트루로 나오는지 고민해보기 // 중복값을 허용하는데 print 되는데까지가 맨마지막 a 이기 때문에 가능한거임

        }
    }
}