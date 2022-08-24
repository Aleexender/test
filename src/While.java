public class While {
    public static void main(String[] args) {
        int i = 0;

        while (i < 5) {
            System.out.println("while 문이" + (i + 1) + "번째 반복 실행중입니다.");
            i++; // 이부분을 뻬면 무한루프에 빠짐...  1 만 계속 진행된다
        }
            System.out.println("while 문이 종료된 후 변수 i의 값은 " + i + "입니다");

    }
}
