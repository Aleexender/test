package tread;

import java.util.ArrayList;
import java.util.List;

public class ThreadMain {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i < 100; i++){
            CustomThread customThread = new CustomThread(i,list);

            customThread.start();

        }
