package Data_Structures._3_Stacks_and_Queues._1_Stack._2_Custom_Stack;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1; // pointer, here if we want to insert item then pointer should be increase by one

    public CustomStack(){
        this(DEFAULT_SIZE);
    } //here if not size passed via argument then this constructor call the other constructor with passing default size = 10

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {
        if (isFull()) { //also can trow an exception like below functions
            System.out.println("Stack is full!!");
            return false;
        }
        ptr++; // pointer increase
        data[ptr] = item;
        return true;
    }

    public int pop() throws StackException {
        if (isEmpty()) {
            throw new StackException("Cannot pop from an empty stack!!");
        }
      // int removed = data[ptr];
      // ptr--;
      // return removed;
        return data[ptr--];
    }

    public int peek() throws StackException {
        if (isEmpty()) {
            throw new StackException("Cannot peek from an empty stack!!");
        }
        return data[ptr];
    }

    public boolean isFull() {
        return ptr == data.length - 1; // ptr is at last index
    }

    public boolean isEmpty() {
        return ptr == -1;
    }
}
