public class Swit {
    public static void main(String[] args) {
        int a = 2;
        System.out.println("switch(1)");
        switch (a) {   // 2 면 1은 예외하고 2,3 을 진행
            case 1:
                System.out.println("one");
//                break;
            case 2:
                System.out.println("two");
                break; // 브레이크 여기서 멈춤
            case 3:
                System.out.println("three");
//                break;
            default: //
                System.out.println("etc");
                break;
        }

//        int val = 1;
//        if (val == 1) ;
//        System.out.println("one");
////    } else if(val ==2){   // 이것도 안됨 ㅆㅂ
//        System.out.println();

        System.out.println("switch(2)");
        switch(1){
            case 1:
                System.out.println("one");
            case 2:
                System.out.println("two");
            case 3:
                System.out.println("three");
        }
        }
    }
