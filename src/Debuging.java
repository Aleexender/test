public class Debuging {
    public static void main(String[] args) {
        int a = 2;
        int last = 0;
        for(int i = 1; i < 10; i ++){  // 시작점 i = 0시작 i 가 10 보다 작을때 계속 하고 i++는 i = i +1 - 파이썬 += 이랑 똑같다
            System.out.println("last=" + last + "i=" + i + "a=" + a);
        }
            System.out.println(last);
    }
}
