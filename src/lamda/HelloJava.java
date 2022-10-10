package lamda;


public class HelloJava {
    public interface JavaCoding{
        void nowCoding();
    }

    public static void main(String[] args) {

        JavaCoding jc; // 객체선언

        jc = () ->{
            System.out.println("롤린 롤린");
        };  // 꼭 ; 붙이기
        jc.nowCoding();
    }
}
