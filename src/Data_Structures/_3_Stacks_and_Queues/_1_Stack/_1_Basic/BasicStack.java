package Data_Structures._3_Stacks_and_Queues._1_Stack._1_Basic;

import java.util.Stack;

public class BasicStack {

    public static void main(String[] args) {

        //Stack Implementation
       Stack<Integer> stack = new Stack<>();

        stack.push(34);
        stack.push(45);
        stack.push(2);
        stack.push(9);
        stack.push(18);

        System.out.println("Insert Elements");
        System.out.println(stack);

        stack.pop();
        stack.pop();

        System.out.println("Remove Elements");
        System.out.println(stack);

        System.out.println("Top Element(Last): " + stack.peek());
        System.out.println("After peek not removed element");
        System.out.println(stack);

        System.out.println("isEmpty: " + stack.isEmpty());
        System.out.println("Size is: " + stack.size());

        System.out.println("Remove all Elements");
        stack.clear();
        System.out.println(stack);

        //stack.pop(); // got exception stack is empty

    }
}
