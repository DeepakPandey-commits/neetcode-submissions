class Solution {
    public int firstUniqChar(String s) {
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            for(int j= i+1; j<s.length(); j++){
                if(ch == s.charAt(j)){
                    return i;
                }
            }
        }
        return -1;
    }
}