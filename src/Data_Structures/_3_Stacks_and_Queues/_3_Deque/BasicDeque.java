package Data_Structures._3_Stacks_and_Queues._3_Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class BasicDeque {

    public static void main(String[] args) {

        //Deque Implementation
        Deque<Integer> deque = new ArrayDeque<>();

        deque.add(89);
        deque.add(19);
        deque.add(27);
        deque.add(75);

        System.out.println("After Inserting Elements");
        System.out.println(deque);

        deque.addLast(78);
        System.out.println("Insert Element to Last");
        System.out.println(deque);

        deque.addFirst(11);
        System.out.println("Insert Element to First");
        System.out.println(deque);


        deque.removeFirst();
        System.out.println("Remove First Elements");
        System.out.println(deque);

        deque.removeLast();
        System.out.println("Remove Last Elements");
        System.out.println(deque);


        System.out.println("Top Element: " + deque.peek());
        System.out.println("After peek not removed element");
        System.out.println(deque);
    }
}
