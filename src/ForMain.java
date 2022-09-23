import java.util.ArrayList;
import java.util.List;

public class ForMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        for(int i =0; i < list.size();i++){
            System.out.println(list.get(i));
        }
        for(Integer a:list){
            System.out.println(a);
        }

        list.stream().forEach(a->{
            System.out.println(a);
        });
    }
}
