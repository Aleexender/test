package person;

public class PersonMain {
    public static void main(String[] args) {


        Person person = new Person(24,"정훈");
        person.speak(); //정훈
        Person person1 = new Person(30, "민우썜",person);
        person1.speak();// 정훈
        person.speak(); // 붕어
        person1.speak(); //  정훈
        person1.speak2(); // 붕어
        person1.student.name = "장훈";
    }
}