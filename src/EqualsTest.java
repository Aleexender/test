import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class EqualsTest {
    public static void main(String[] args) {
        String a = "abcd";
        String b = "abcd";
        String c = "abasd";

        People people = new People("정훈");
        People people1 = new People("정훈");

//        System.out.println(a.hashCode());
//        System.out.println(b.hashCode());
        System.out.println(a == b);
//        System.out.println(a.equals(c));

        System.out.println(people1.equals(people));
        System.out.println(people1.hashCode());
        System.out.println(people.hashCode());
        /**
         * a b 는 true
         * a c 는 false
         *  == 는 주소값을 비교하는 연산자다....?
         *  == 주소값을 비교
         *  equals() 순수 값을 비교
         *
         *  아 만약에 같은 값이 들어가 있으면 똑같은 레퍼런스 주소값을 향해 있나?
         */
    }


}
