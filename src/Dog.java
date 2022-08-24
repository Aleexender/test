/**
 * @author: Minwoo Kim
 * @date 2022/06/22
 */
public class Dog {

    static String special = "A";
    int age;
    String name;

    public Dog(){
        int someAge = 41241;
        String name = "ASDFASDF";

        this.age = someAge;
        this.name = "doggy";
        System.out.println("나 여기까지 했어");
    }

    public Dog(int a, String n){
        this.age = a;
    }

    public Dog(String name, int age){
        this.age = age;
        this.name = name;
    }


    public void bark(){
        System.out.println("my name is " + this.name);
    }

}
