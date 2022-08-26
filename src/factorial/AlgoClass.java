package factorial;

public class AlgoClass {
    public static void main(String[] args) {
//        for(int i = 0; i<10000; i++){ // 2번째
//            System.out.println(i);
//        }
//        for(int j = 0; j <10000; j++){ // 1번쨰
//            System.out.println(j);
//
//        }

        int result = Factorial.recursive(4);
        System.out.println(result);

        result = Factorial.iterative(6);
        System.out.println(result);



    }



}
