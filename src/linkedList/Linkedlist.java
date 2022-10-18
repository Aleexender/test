package linkedList;

import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.addFirst(1); // 가장 앞에 데이터 추가
        linkedList.addLast(8); // 가장 뒤에 데이터 추가
        linkedList.add(3); // 데이터 추가
        linkedList.add(2,4); // 원하는 인덱스에 데이터 추가

//        linkedList.removeFirst(); // 가장 앞에있는 데이터 제거
//        linkedList.removeLast(); // 가장 뒤에있는 데이터 제거
//        linkedList.remove(); // 생략시 0번째 인덱스 제거
////        linkedList.remove(1); //1번째 데이터 제거
//        linkedList.clear(); // 모든 데이터 제거

        linkedList.set(0, 3);
