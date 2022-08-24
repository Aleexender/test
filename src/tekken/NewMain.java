package tekken;

public class NewMain {
   static Integer a = 5; // 레퍼런스 변수이자 인스턴스 변수
   static int b; // 이거는 프레미티브이자 인스턴스 변수
    static Lee lee;
    public static void main(String[] args) {
        lee = new Lee();
        lee.toString(); // 메소드가 있어서
        a.toString();
        Integer c = 4; // 레퍼런스
        int d = 5;
        double z = 5.0;
        Double x = 3.0;
        boolean likeChoco = true;
        Boolean likeChoco2 = null;

        double a1 = 3.0;
        double a2 = 4.0;
        Double b1 = 3.0;
        Double b2 = 4.0;

//        System.out.println(a1.toString());
        System.out.println(b1.toString());

//        System.out.println(add(a1,a2));
//        System.out.println(add(b1,b2));
//        System.out.println(add2(a1,a2));
//        System.out.println(add2(b1,b2));

    }

    public static Integer add2(int number, int number2){
        return number + number2;
    }


    public static Integer add(Number number, Number number2){
        return number.intValue() + number2.intValue();
    }

}
