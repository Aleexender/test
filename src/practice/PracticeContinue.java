package practice;

public class PracticeContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0 || i % 2 == 0) {
                System.out.println(i);
            } else {
                continue;
            }
        }
    }
}