public class TestTest {
    public static void main(String[] args) {
        String[] a = new String[1];
        a[0] = "민우";
        String[] b = a;
        String[] c = {"정훈"};
        c = a;
        a[0] = "악마쌤";
        System.out.println(b[0]);
    }
}
