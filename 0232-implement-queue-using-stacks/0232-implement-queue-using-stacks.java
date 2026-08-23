class MyQueue {

    private Stack<Integer> s1;
    private Stack<Integer> s2;
    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    
    public void push(int x) {
        // Move all elements from s1 to s2
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        s1.push(x); // Push new element into s1

        // Move everything back from q2 to q1
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }
    
    public int pop() { // O(1)
        return s1.pop();
    }
    
    public int peek() { // O(1)
        return s1.peek();
    }
    
    public boolean empty() { // O(1)
        return s1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */