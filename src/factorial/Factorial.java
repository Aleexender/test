package factorial;

public class Factorial {

    public static int recursive(int n) { // 왔다 갔다 , 끝점을 고려
        if (n == 1) {   // base
            return 1;   // base
        }
         return recursive(n - 1) * n;
    }

    public static int iterative(int n){
        int result = 1;
//        for(int i=1; i<=n; i++){
//            result *= i;
//        }
        for(int i=n; i>=1; i--){ // 시작점을 고려
            result *= i;
        }
        return result;
    }
}
