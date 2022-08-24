package jobs;

public class MainLauncher {
    public static void main(String[] args) {
        Person person = new Person("민우", 30, 176);
        person.introduceName();
        person = new Programmer("정훈", 24, 185);
        person.introduceName();


    }
}
