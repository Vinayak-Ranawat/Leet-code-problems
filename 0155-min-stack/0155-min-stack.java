class MinStack {

    // private Stack<int[]> s; // O(2*n)

    // public MinStack() {
    //     s = new Stack<>();
    // }
    
    // public void push(int val) {
    //     if (s.isEmpty()) {
    //         s.push(new int[]{val, val});
    //     } else {
    //         int minVal = Math.min(val, s.peek()[1]);
    //         s.push(new int[]{val, minVal});
    //     }
    // }
    
    // public void pop() {
    //     s.pop();
    // }
    
    // public int top() {
    //     return s.peek()[0];
    // }
    
    // public int getMin() {
    //     return s.peek()[1];
    // }

    // O(n)
    private Stack<Long> s;
    private long minVal;

    public MinStack() {
        s = new Stack<>();
    }
    
    public void push(int val) {
        if (s.isEmpty()) {
            s.push((long) val);
            minVal = val;
        } else {
            if (val < minVal) {
                s.push(2L * val - minVal);
                minVal = val;
            } else {
                s.push((long) val);
            }
        }
    }
    
    public void pop() {
        if (s.peek() < minVal) {
            minVal = 2 * minVal - s.peek();
        }
        s.pop();
    }
    
    public int top() {
        if (s.peek() < minVal) {
            return (int) minVal;
        }
        return s.peek().intValue();
    }
    
    public int getMin() {
        return (int) minVal;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */