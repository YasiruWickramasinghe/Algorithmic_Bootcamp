package Data_Structures._3_Stacks_and_Queues._1_Stack._2_Custom_Stack;

public class CustomStackMain {
    public static void main(String[] args) throws StackException {
        CustomStack stack = new CustomStack(5);

        System.out.println("Insert Elements");
        System.out.println(stack.push(34));
        System.out.println(stack.push(45));
        System.out.println(stack.push(2));
        System.out.println(stack.push(9));
        System.out.println(stack.push(18));
        System.out.println(stack.push(48)); // stack is full


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
