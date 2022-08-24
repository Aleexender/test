public class Person {

    String name;
    int age;

    void introduce(){
        System.out.println("hi My name is : " + this.name);
    }

    void introduce2(){
        if("민우".equals(this.name)){
            System.out.println("hi My name is 민우");
        }
        if("정훈".equals(this.name)){
            System.out.println("hi My name is 정훈");
        }
        if("혜정".equals(this.name)){
            System.out.println("hi My name is 혜정");

        }
    }
}