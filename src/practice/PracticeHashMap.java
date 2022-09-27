package practice;
import java.util.*;

public class PracticeHashMap {

    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String,Integer> map = new HashMap<>();
        for(String each : participant){
            System.out.println(each);
            if(map.containsKey(each)){ // 똑같은 이름이 들어가있으면 true 아니면 false
                map.put(each,map.get(each) + 1); // 들어가있으면
            }else{ // 안들어가있으면
              Integer integer = map.get(each); //여기에 왜 인티저로 들어가있을까 숫자 넣어야 해서 그런듯?
                map.put(each,1);
            }
        }
        for(String each1 : completion){
            Integer integer = map.get(each1);
            if(map.containsKey(each1)){
                map.put(each1,map.get(each1) -1);
            }
        }
        for(String each3 : map.keySet()){
            Integer integer = map.get(each3);
            if(integer == 1){
                return each3;
            }
        }

        return null;

    }
}
