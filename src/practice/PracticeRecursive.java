package practice;

public class PracticeRecursive {

        public static int recursiveSum(int n) {
            if (n == 1) { // n 이 1이면 그냥 1을 반환
                return 1;
            }
       return n + recursiveSum(n-1); // n 이 1이 아니면, n을 1부터(n-1) 까지의 합과 더한 값을 반환
        }
}

