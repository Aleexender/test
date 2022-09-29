package practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PracticeStackQueue {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        Queue<Integer> queue = new LinkedList<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.add(5);

        queue.offer(1);
        queue.offer(2);
        queue.offer(3); // false
        queue.add(4); // 에러 발생



    }
}

