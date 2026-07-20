class Solution {
    public boolean isSubsequence(String s, String t) {
        
        for(int i=0; i<s.length(); i++){
            for(int j=0; j<t.length(); j++){
                if(s.charAt(i) != t.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }
}