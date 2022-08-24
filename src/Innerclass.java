public class Innerclass {
    String name;

    void show() {
        System.out.println("외부 클래스");
    }

    static class in {
        int id;

        void show2() {
            System.out.println("내가 모루는 공식");
//    abstract class Person{
//        abstract void eat();
//    }
//    class TestAnonymousInner{
//        public static void main(String args[]){
//            Person p = new Person(){
//                void eat() {System.out.println("nice fruit");}  // ???? 이거 ㅆㅂ 왜 안대 하란대로 했는데
//            };
//            p.eat();
        }
    }
}
