package leetcode.Q20;

import java.util.Stack;

public class Valid_Parentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        char[] c = s.toCharArray();

        for (int i = 0; i < c.length; i++) {

            if(c[i] != ')' && c[i] != '}' && c[i] != ']')
                stack.push(c[i]);

            else{

                if(stack.empty())
                    return false;

                else if(c[i] == ')' && stack.peek() != '(' || c[i] == '}' && stack.peek() != '{' || c[i] == ']' && stack.peek() != '[')
                    return false;

                else
                    stack.pop();
            }

        }
        return stack.isEmpty() ? true : false;
    }
}
