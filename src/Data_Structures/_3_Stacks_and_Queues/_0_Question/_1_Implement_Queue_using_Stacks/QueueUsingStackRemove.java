package Data_Structures._3_Stacks_and_Queues._0_Question._1_Implement_Queue_using_Stacks;
import java.util.Stack;

//Remove Efficiency

public class QueueUsingStackRemove {
  private Stack<Integer> first;
  private Stack<Integer> second;

  public QueueUsingStackRemove() {
    first = new Stack<>();
    second = new Stack<>();
  }

  public void add(int item) throws Exception {
    while (!first.isEmpty()) {
      second.push(first.pop());
    }
    first.push(item);
    while (!second.isEmpty()) {
      first.push(second.pop());
    }
  }

  public int remove() throws Exception {
    return first.pop();
  }

  public int peek() throws Exception {
    return first.peek();
  }

  public boolean isEmpty() {
    return first.isEmpty();
  }

}