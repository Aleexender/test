import java.util.Arrays;

public class Debugging3 {
    public static void main(String[] args) {
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;

        int[] arr2 = new int[4];
        arr2[0] = arr1[0];  //arr1 에 0 번째 사용
        arr2[1] = arr1[1];  //arr1 에 1 번째 사용
        arr2[2] = arr1[2]; // arr1 에 2 번째 사용
        arr2[3] = 4;

        arr1 = arr2;
        System.out.println(String.valueOf(arr1));
    }
}
