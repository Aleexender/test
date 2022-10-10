import java.util.HashMap;
import java.util.Map;

public class HashMap123 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();

        map.put("weq",12);
        map.put("weq4",121);
        map.put("weq3",122);
        map.put("weq2",125);


        for(String key : map.keySet()){ // k가아닌값으로 찾는 방법 keyset 방법 (벨류로 키를 찾는방법)
            if(map.get(key)== 122) {
                System.out.println(key);
            }
        }


        System.out.println(map.get("weq")); //key

    }
}
