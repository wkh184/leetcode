class MinStack {
    private Stack<Integer> internalStack;
    private PriorityQueue<Integer> minValue;

    public MinStack() {
        internalStack = new Stack<Integer>();
        minValue = new PriorityQueue<Integer>();
    }
    
    public void push(int val) {
        internalStack.push(val);
        minValue.offer(val);
    }
    
    public void pop() {
        if(!internalStack.empty()){
            // if(minValue.contains(internalStack.peek())){
            //     boolean temp = minValue.remove(internalStack.peek());
            //     System.out.println("internalStack.peek() = " + internalStack.peek().intValue());
            // }
            minValue.remove(internalStack.peek());
            internalStack.pop();
        }
    }
    
    public int top() {
        if(!internalStack.empty()){
            return internalStack.peek().intValue();
        }
        return 0;
    }
    
    public int getMin() {
        if(minValue.size() > 0){
            return minValue.peek().intValue();
        }
        return 0;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */