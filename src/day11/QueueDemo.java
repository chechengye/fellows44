package day11;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 队列
 */
public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("A");
        queue.add("B");
        queue.add("C");
        //弹出并获取
        //System.out.println(queue.poll());
        System.out.println(queue.element());
        queue.forEach(System.out::println);
        System.out.println("-----------------------");
        Deque<String> deque = new LinkedList<>();
        deque.add("A");
        deque.add("B");
        deque.add("C");
        System.out.println(deque.getLast());
    }
}
