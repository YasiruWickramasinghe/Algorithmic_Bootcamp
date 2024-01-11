package Data_Structures._3_Stacks_and_Queues._1_Stack._3_Dynamic_Stack;

import Data_Structures._3_Stacks_and_Queues._1_Stack._2_Custom_Stack.CustomStack;
import Data_Structures._3_Stacks_and_Queues._1_Stack._2_Custom_Stack.StackException;

public class DynamicStackMain {
    public static void main(String[] args) throws StackException {
        CustomStack stack = new DynamicStack(5);

        System.out.println("Insert Elements");
        System.out.println(stack.push(34));
        System.out.println(stack.push(45));
        System.out.println(stack.push(2));
        System.out.println(stack.push(9));
        System.out.println(stack.push(18));
        System.out.println(stack.push(27)); // stack size increased by double

        System.out.println("Remove Elements");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        //System.out.println(stack.pop()); // throw an exception in peek() stack is empty
        //System.out.println(stack.pop()); // throw an exception

        System.out.println("Top Element(Last): " + stack.peek());
    }
}
