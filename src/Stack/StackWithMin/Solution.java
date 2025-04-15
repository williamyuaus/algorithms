package Stack.StackWithMin;

import java.util.Stack;

public class Solution {
    Stack<Integer> dataStack = new Stack<>();

    Stack<Integer> minStack = new Stack<>();

    public void push(int node) {
        dataStack.push(node);
        if (minStack == null || node < minStack.peek()) {
            minStack.push(node);
        } else {
            minStack.push(minStack.peek());
        }
    }

    public void pop() {
        dataStack.pop();
        minStack.pop();
    }

    public int top() {
        return dataStack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}
