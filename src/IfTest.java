public class IfTest {
    int a = 5;
    int b = 5;

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int dayOfWeek = 5;

        if (dayOfWeek == 1) {
            System.out.println("월요일");
        } else if (dayOfWeek == 2) {
            System.out.println("화요일");
        } else if (dayOfWeek == 3) {
            System.out.println("수요일");
        } else if (dayOfWeek == 4) {
            System.out.println("목요일");
        } else if (dayOfWeek == 5) {
            System.out.println("금요일");
        } else {
            System.out.println("주말 또는 유효하지 않은 값");
        }
        long endTime = System.nanoTime();

        long duration = endTime - startTime;
        System.out.println("if문: " + duration);
    }

}
