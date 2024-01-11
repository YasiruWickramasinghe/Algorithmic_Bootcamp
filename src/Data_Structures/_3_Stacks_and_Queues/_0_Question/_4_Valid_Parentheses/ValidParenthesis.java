package Data_Structures._3_Stacks_and_Queues._0_Question._4_Valid_Parentheses;
import java.util.Stack;

class Solution2 {
  public boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();

    for (char ch : s.toCharArray()) {
      if (ch == '(' || ch == '{' || ch == '[') {
        stack.push(ch);
      } else {
        if (ch == ')') {
          if (stack.isEmpty() || stack.pop() != '(') {
            return false;
          }
        }
        if (ch == '}') {
          if (stack.isEmpty() || stack.pop() != '{') {
            return false;
          }
        }
        if (ch == ']') {
          if (stack.isEmpty() || stack.pop() != '[') {
            return false;
          }
        }
      }
    }
    return stack.isEmpty();
  }
}