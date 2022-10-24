package lamda;

public class PersonMain {
    public static void main(String[] args) {
        Say f1 = (x, y) -> {
        return x + y;};
        System.out.println(f1);
    }
}
