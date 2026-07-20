class MinStack {
    ArrayList<Integer> list = new ArrayList<>();
    ArrayList<Integer> minlist = new ArrayList<>();

    public MinStack() {
        
    }
    
    public void push(int val) {
        list.add(val);

        if(minlist.size()==0){
            minlist.add(val);
        }else{
            int currMin = minlist.get(minlist.size()-1);
            minlist.add(Math.min(val,currMin));
        }
        
    }
    
    public void pop() {
        if(list.size()==0){
            return;
        }
        
        list.remove(list.size()-1);
        minlist.remove(minlist.size()-1);
        
    }
    
    public int top() {
        return list.get(list.size()-1);
        
        
    }
    
    public int getMin() {
        return minlist.get(minlist.size()-1);
    }
}
