import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class EqualsTest {
    public static void main(String[] args) {
        String a = "abc";
        String b = "abc";
        String c = "abc";
        String d = "abcd";

        People people = new People("철수");
        People people1 = new People("철수");
        People people2 = new People("훈이");
        People people3 = new People("짱구");

        System.out.println(people.hashCode());
        System.out.println(people1.hashCode());
        System.out.println(people2.hashCode());
        System.out.println(people3.hashCode());

        Set<People> hash = new HashSet<>();
        hash.add(people);
        hash.add(people1);
        hash.add(people2);
        hash.add(people3);

        System.out.println(hash.size());

        a.equals()

//        System.out.println(people1.hashCode());
//        System.out.println(people.hashCode());
////        String.valueOf(;
//        System.out.println(people1.equals(people));
//
//        System.out.println(a.equals(b));
//        System.out.println(a.hashCode());
//        System.out.println(b.hashCode());
//
        String word1 = new String("abc");
        String word2 = new String("abc");
//
//        String s = String.valueOf(a + b);
//        String z = a + b;
//
//        System.out.println(s == z);
//
////        System.out.println(word1 == word2);
////        System.out.println(word1.equals(word2));
////        System.out.println(a == b);
////        System.out.println(a.equals(b));
////        System.out.println(a.hashCode());
////        System.out.println(b.hashCode());
//////        System.out.println(a == b);
////
//////        System.out.println(a.equals(b));
////
////        System.out.println(people1.equals(people));
////        System.out.println(people1.hashCode());
////        System.out.println(people.hashCode());
////
//        Set<People> peopleSet = new HashSet<>();
//        People people2 = new People("철수");
//        People people3 = new People("철수");
//        peopleSet.add(people3);
//        peopleSet.add(people2);
////        int size = peopleSet.size();
//        System.out.println(peopleSet.size()); // 2
//
//        System.out.println(people2.hashCode());
//        System.out.println(people3.hashCode());
//
////
////
////        int hash = Objects.hash(a,b);
////        int hash1 = Objects.hash(c,d);
////        System.out.println(hash1);
////        System.out.println(hash);
//
//        /**
//         * a b 는 true
//         * a c 는 false
//         *  == 는 주소값을 비교하는 연산자다....?
//         *  == 주소값을 비교
//         *  equals() 순수 값을 비교
//         *
//         *  아 만약에 같은 값이 들어가 있으면 똑같은 레퍼런스 주소값을 향해 있나?
//         */
    }


}
