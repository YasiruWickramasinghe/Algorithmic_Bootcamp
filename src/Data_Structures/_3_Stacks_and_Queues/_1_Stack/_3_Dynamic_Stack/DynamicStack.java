package Data_Structures._3_Stacks_and_Queues._1_Stack._3_Dynamic_Stack;

import Data_Structures._3_Stacks_and_Queues._1_Stack._2_Custom_Stack.CustomStack;

public class DynamicStack extends CustomStack {

    public DynamicStack() {
        super(); // it will call CustomStack()
    }

    public DynamicStack(int size) {
        super(size); // it will call CustomStack(int size)
    }

    @Override
    public boolean push(int item) {
        // this takes care of it being full
        if (this.isFull()) {
            // double the array size
            int[] temp = new int[data.length * 2];

            // copy all previous items in new data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }

            data = temp;
            System.out.println("Stack Size Increased by Double");
        }

        // at this point we know that array is not full
        // insert item
        return super.push(item);
    }
}
