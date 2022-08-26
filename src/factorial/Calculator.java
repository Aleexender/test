package factorial;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("팩토리얼 계산을 위한 정수값 입력");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fac = 1; //초기값 설정
        for(int i = num; i > 0; i--){ // 반대로 넣어도 작동됨 ++ <
        fac = fac * i; // fac *= i;
            System.out.println(num + "! = " + fac);
        }
    }
}
