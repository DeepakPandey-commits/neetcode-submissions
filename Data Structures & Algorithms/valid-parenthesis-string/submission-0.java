class Solution {
    public boolean checkValidString(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            Char ch = s.charAt(i);

            if(ch == '(' || ch == '*'){
                st.push();
            }else{
                if(st.isEmpty()){
                    return false;
                }else if( (st.peek()=='( ' && ch == ')') || (st.peek()=='*' && ch == ')') || (st.peek()=='(' && ch == '*')){
                    s.pop();
                }else{
                    return false;
                }
            }
        }
        if(st.peek() == '*'){
            if(s.pop()){
                if(st.isEmpty()){
                    return true;
                }
            }
            else{
                return false;
            }
        }
        return false;
    }
}
