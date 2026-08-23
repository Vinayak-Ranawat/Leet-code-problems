class MyStack {

    Queue<Integer> q1;
    Queue<Integer> q2;
    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
    public void push(int x) { 
        // Move all elements from q1 to q2
        while(!q1.isEmpty()){
            q2.add(q1.poll());
        }

        q1.add(x); // Push new element into q1

        // Move everything back from q2 to q1
        while(!q2.isEmpty()){
            q1.add(q2.poll());
        }
    }
    
    public int pop() { // O(1)
        return q1.poll();
    }
    
    public int top() { // O(1)
        return q1.peek();
    }
    
    public boolean empty() { // O(1)
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */