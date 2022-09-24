import java.util.ArrayList;
import java.util.List;

public class ForEnhanced {
    public static void main(String[] args) {

       List<Integer> list = new ArrayList<>();
       list.add(1);
       list.add(2);
       list.add(3);


        for(int a=0; a<list.size();a++){
            System.out.println(list.get(a));
        }


        for(int a : list){
            System.out.println(a);
        }
    }
}
