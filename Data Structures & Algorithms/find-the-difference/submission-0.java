class Solution {
    public char findTheDifference(String s, String t) {
        for(int i = 0; i<t.length(); i++){
            char ch = charAt(i);
            if(s.contains(ch)){
                continue;
            }else{
                return ch;
            }
        }
        return x;
    }
}