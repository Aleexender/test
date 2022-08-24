package jobs;

public class Person {
    String name;
    int age;
    int height;
    int wage;

    public Person(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;

    }

    public void introduceName(){
        System.out.println("my name is " + this.name);

    }
}
