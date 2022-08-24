public class WrapperClas {
    public static void main(String[] args) {
        Integer a = 3;
        Integer z = 3;
        Short q = 4;
        Short w = 4;
        Long l1 = 128L;
        Long l2 = 128L;

        System.out.println(q==w); // true
        System.out.println(q.equals(w)); // true
        System.out.println(z==a); // true / ?? 왜 래퍼런스 주소값이 같을까??
        System.out.println(a.equals(z)); // true
        System.out.println(l1==l2); // false
        System.out.println(l1.equals(l2)); // true

        Integer num = new Integer(17); // 박싱
        Integer num2 = new Integer(17); // 박싱
        System.out.println(num == num2);   // false / ==대상의 주소값을 비교
        System.out.println(num.equals(num2)); // true / equals 대상의 내용 자체를 비교


    }
}
