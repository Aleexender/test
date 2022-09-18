import java.util.*;

public class Hash {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList(new String[]{"a", "b", "c", "a"}));
        HashSet<String> set = new HashSet();
        for(String a : list) {
            set.add(a);
        }
        System.out.println(set);
    }
}