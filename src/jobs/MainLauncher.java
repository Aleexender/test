package jobs;

public class MainLauncher {
    public static void main(String[] args) {
        //test
        Person person = new Person("민우", 30, 176);
        person.introduceName();
        person = new Nogada("정훈", 24, 185);
        person.wage = 200;
        person.introduceName();


    }
}
