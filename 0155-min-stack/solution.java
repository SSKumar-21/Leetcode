class MinStack {
    Stack<Long> s = new Stack<>();
    long min;
    public MinStack() {
        
    }
    
    public void push(int val) {
        if (s.empty()){
            s.push((long)val);
            min = (long)val;
        } else if (val < min) { 
            s.push(2L*val - min); 
            min = (long)val; 
        } else {
            s.push((long)val);
        }
    }
    
    public void pop() {
        long del = s.pop();
        if (del < min){
            min = 2*min - del;
        }
    }
    
    public int top() {
        long ele = s.peek();
        return ele < min ? (int)min : (int)ele ;
    }
    
    public int getMin() {
        return (int)min;
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
