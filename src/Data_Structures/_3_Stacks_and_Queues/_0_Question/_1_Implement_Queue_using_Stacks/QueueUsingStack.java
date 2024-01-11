package Data_Structures._3_Stacks_and_Queues._0_Question._1_Implement_Queue_using_Stacks;

import java.util.Stack;

//Insertion Efficiency
public class QueueUsingStack {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStack() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void add(int item) {
        first.push(item);
    }

    public int remove() throws Exception {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        int removed = second.pop();

        while (!second.isEmpty()) {
            first.push(second.pop());
        }
        return removed;
    }

    public int peek() throws Exception {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }

        int peeked = second.peek();

        while (!second.isEmpty()) {
            first.push(second.pop());
        }
        return peeked;
    }

    public boolean isEmpty() {
        return first.isEmpty();
    }

}