package Data_Structures._3_Stacks_and_Queues._2_Queue._1_Basic;

import java.util.*;

public class BasicQueue {

    public static void main(String[] args) {

        //Queue Implementation
        Queue<Integer> queue = new LinkedList<>();

        queue.add(3);
        queue.add(6);
        queue.add(5);
        queue.add(19);
        queue.add(1);

        System.out.println("Insert Elements");
        System.out.println(queue);

        queue.remove();
        queue.remove();
        System.out.println("Remove Elements");
        System.out.println(queue);

        System.out.println("Top Element(First): " + queue.peek());
        System.out.println("After peek not removed element");
        System.out.println(queue);

        System.out.println("isEmpty: " + queue.isEmpty());
        System.out.println("Size is: " + queue.size());

        System.out.println("Remove all Elements");
        queue.clear();
        System.out.println(queue);

//        //Deque Implementation
//        Deque<Integer> deque = new ArrayDeque<>();
//
//        deque.add(89);
//        deque.add(19);
//        deque.add(27);
//        deque.add(75);
//
//        System.out.println("After Inserting Elements");
//        System.out.println(deque);
//
//        deque.addLast(78);
//        System.out.println("Insert Element to Last");
//        System.out.println(deque);
//
//        deque.addFirst(11);
//        System.out.println("Insert Element to First");
//        System.out.println(deque);
//
//
//        deque.removeFirst();
//        System.out.println("Remove First Elements");
//        System.out.println(deque);
//
//        deque.removeLast();
//        System.out.println("Remove Last Elements");
//        System.out.println(deque);
//
//
//        System.out.println("Top Element: " + deque.peek());
//        System.out.println("After peek not removed element");
//        System.out.println(deque);
    }
}
