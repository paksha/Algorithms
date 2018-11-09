/*
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.
Example:
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   --> Returns -3.
minStack.pop();
minStack.top();      --> Returns 0.
minStack.getMin();   --> Returns -2.
*/

class MinStack {
    ArrayList stack, minstack;
    int stacklen, minlen;
    /** initialize your data structure here. */
    public MinStack() {
        stack = new ArrayList();
        stacklen = 0;
        minstack = new ArrayList();
        minlen = 0;
    }
    
    public void push(int x) {
        stack.add(x);
        stacklen++;
        if (minlen == 0 || (x <= (int)minstack.get(minlen-1))) {
            minstack.add(x);
            minlen++;
        }
    }
    
    public void pop() {
        if (stacklen > 0 && minlen > 0) {
            int val = (int)stack.get(stacklen-1);
            stack.remove(stacklen-1);
            stacklen--;
            if ((int)minstack.get(minlen-1) == val) {
                minstack.remove(minlen-1);
                minlen--;
            }
        }
    }
    
    public int top() {
        return (int)stack.get(stacklen-1);
    }
    
    public int getMin() {
        return (int)minstack.get(minlen-1);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */