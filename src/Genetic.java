import java.util.ArrayList;
import java.util.List;

public class Genetic {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList(); // <> 로 제한을 걸어둔다/ 리스트 선언방법
        list.add(1); // 삽입
        list.add(2); // 삭제는 List.remove(index) / 전체삭제 - List.clear
        list.add(3);
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        System.out.println(array);
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }


        for(int i = 0; i < list.size(); i++){
            Integer a = 1 + list.get(i);
            System.out.println(list.get(i));
        }
        for(Integer a : list){
            Integer b = 1 + a;
            System.out.println(a);
        }

        System.out.println(list);

        int z = 3;
        String x = String.valueOf(z);
    }
}
