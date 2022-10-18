package singletone;

public class Singletone {
    public static void main(String[] args) {


        Phone phone = Phone.getInstance();
        Phone phone2 = Phone.getInstance();

    }
}
