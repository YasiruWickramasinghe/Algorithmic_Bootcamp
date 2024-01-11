package Data_Structures._3_Stacks_and_Queues._2_Queue._2_Custom_Queue;

public class CustomQueueMain {
    public static void main(String[] args) throws Exception {
        CustomQueue queue = new CustomQueue(5);
        queue.add(3);
        queue.add(6);
        queue.add(5);
        queue.add(19);
        queue.add(1);

        queue.display();
        System.out.println(queue.remove());
        queue.display();
    }
}
