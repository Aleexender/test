package person;

public class Person {
    int age;
    String name;
    Person student;
    public void speak2(){
        System.out.println("I teach " + this.student.name);
    }
    public void speak(){
        System.out.println("i am " + this.name );
    }
    public Person(int age, String name){
        this.age = age;
        this.name = name;
    }
    public Person(int age, String name, Person person){
        this.age = age;
        this.student = person;
        this.name = this.student.name;
        this.student.name = "붕어";
    }

}
