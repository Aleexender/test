package pibonacci;

public class FiboMain {
    public static void main(String[] args) {
        int result = Fibonacci.iterative(5 );
        System.out.println(result);

        int result2 = Fibonacci.recursive(7);
        System.out.println(result2);
    }
}
