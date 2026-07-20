class MinStack {
    Stack<Integer> s = new Stack<>();
    Stack<Integer> smin = new Stack<>();

    public MinStack() {
        
    }
    
    public void push(int val) {
        s.push(val);
        if(smin.isEmpty()== true){
            smin.push(val);
        }else{
            int currMin = smin.peek();
            smin.add(Math.min(currMin , val));
        }
        
    }
    
    public void pop() {
        if(s.isEmpty()== true){
            return;
        }
        s.pop();
        smin.pop();
        
    }
    
    public int top() {
        return s.peek();
        
    }
    
    public int getMin() {
        return smin.peek();
    }
}
