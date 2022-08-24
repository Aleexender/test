package pibonacci;

public class Fibonacci {
    public static int iterative(int n ) {
//        System.out.println(a);
//        System.out.println(b);
//
//        for (int i = 0; i < 5; i++){
//            int c = a + b;
//            System.out.println(c);
//            a = b;
//            b = c;
//        }
//        return pibonacci(2) * a;
        int a = 0;
        int b = 1;

        for(int i = 0; i < n; i ++){
            int c = a + b;
            a = b; // 저장
            b = c; // 저장


        }
        return a;
    }
    public static int recursive(int n){
        if(n==0){
            return 0;
        }
        else if (n == 1){
            return 1;
        }
        else{
            return recursive(n-1) + recursive(n-2);
        }
    }
}
