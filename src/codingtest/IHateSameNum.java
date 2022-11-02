package codingtest;

import java.util.ArrayList;
import java.util.List;

public class IHateSameNum { // 프로그래머스1 번째

    public List<Integer> solution(int []arr) {

        List<Integer> list = new ArrayList<>();


        int temp = -1;

        for(int n :arr){
            if(temp != n) // 두값이 다르면 true 아니면 false  // 처음에만 -1 하고 그다음부터는 temp = n 으로 해서 해결
                list.add(n); // 두값이 다를때 n을 추가
            temp = n;
        }
        return list;
    }
}

