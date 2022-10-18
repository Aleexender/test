package linkedList;

import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.addFirst(1); // 가장 앞에 데이터 추가
        linkedList.addLast(8); // 가장 뒤에 데이터 추가
        linkedList.add(3); // 데이터 추가
        linkedList.add(2,4); // 원하는 인덱스에 데이터 추가
