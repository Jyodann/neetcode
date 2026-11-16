class MinStack {

    // init two stacks, minstack, norm_stack
    // on every push, push to norm_stack
    // if min_Stack is empty OR val < top of min stack,
    // push to min stack

    // on pop, if norm_stack pop is the same value as peek of 
    // min stack, pop both, if not, leave it alone

    Stack<Integer> min_stack;
    Stack<Integer> norm_stack;
    public MinStack() {
        min_stack = new Stack<>();
        norm_stack = new Stack<>();
    }
    
    public void push(int val) {
        norm_stack.push(val);
        if (min_stack.isEmpty() || min_stack.peek() >= val) {
            min_stack.push(val);
        }
    }
    
    public void pop() {
        int val = norm_stack.pop();
        if (val == min_stack.peek()) {
            min_stack.pop();
        }
    }
    
    public int top() {
        return norm_stack.peek();
    }
    
    public int getMin() {
        return min_stack.peek();
    }
}
