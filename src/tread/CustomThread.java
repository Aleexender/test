package tread;

import java.util.List;

public class CustomThread extends Thread{
    int a;
    List<Integer> list;


     public CustomThread(int a, List<Integer> list){
        this.a = a;
        this.list = list;

     }
