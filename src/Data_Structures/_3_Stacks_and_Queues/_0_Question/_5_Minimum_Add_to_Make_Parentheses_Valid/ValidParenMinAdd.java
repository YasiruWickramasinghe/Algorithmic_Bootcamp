package Data_Structures._3_Stacks_and_Queues._0_Question._5_Minimum_Add_to_Make_Parentheses_Valid;
import java.util.Stack;
class Solution1 {
    public int minAddToMakeValid(String s) {
      Stack<Character> stack = new Stack<>();
      for (char ch : s.toCharArray()) {
        if (ch == ')') {
          if (!stack.isEmpty() && stack.peek() == '(') {
            stack.pop();
          } else {
            stack.push(ch);
          }
        } else {
          stack.push(ch);
        }
      }
      return stack.size();
    }
}