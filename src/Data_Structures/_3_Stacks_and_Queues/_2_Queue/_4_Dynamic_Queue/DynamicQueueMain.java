package Data_Structures._3_Stacks_and_Queues._2_Queue._4_Dynamic_Queue;

import Data_Structures._3_Stacks_and_Queues._2_Queue._3_Circular_Queue.CircularQueue;

public class DynamicQueueMain {
    public static void main(String[] args) throws Exception {
        DynamicQueue queue = new DynamicQueue(5);

        queue.add(3);
        queue.add(6);
        queue.add(5);
        queue.add(19);
        queue.add(1);

        queue.display();

        System.out.println(queue.remove());
        queue.add(133);
        queue.display();

        System.out.println(queue.remove());
        queue.add(99);
        queue.display();

    }
}
