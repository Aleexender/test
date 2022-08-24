import sun.lwawt.macosx.CSystemTray;

import java.util.Scanner;


public class Main {
    /* 속성 = instance 변수 , 동작 = method(함수)
//    * class 안에 instance 변수 method ---=> instance ----> instance 변수 method 타입은 똑같은데 속성은 다르다*/
    public static int addOne(int x){
        int y = 2;
        return x+y;

    }


    public static double getHalf(int x){
        return (double) x/2;
    }


    public static void main(String[] args) {
//        int a = addOne(123);
//        double b = getHalf(a);
//        System.out.println(b);
       int c = 1;
       long d = c;
        System.out.println(d);
        Scanner sc = new Scanner(System.in);
    }


}

