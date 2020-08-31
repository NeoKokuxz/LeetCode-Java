class MinStack {

    /** initialize your data structure here. */
    Stack<Integer> stack = new Stack<>(); //Push all element
    Stack<Integer> minStack = new Stack<>(); //Only push element is smaller than current min

    public void push(int x) {
        //If min stack is empty orj current element less than the top of the min stack
        if(minStack.isEmpty() || x <= minStack.peek()){
            //Push the element to min stack
            minStack.push(x);
        }
        stack.push(x);
    }

    public void pop() {
        //Always pop the element from normal stack
        //Only if the element on stack is min at min stack, pop off the min stack top
        if(stack.peek().equals(minStack.peek())){
            minStack.pop();
        }
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
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
