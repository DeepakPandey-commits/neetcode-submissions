class Solution {
    public int firstUniqChar(String s) {
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            boolean isunique = true;
            for(int j= 0; j<s.length(); j++){
                if(i!=j && ch == s.charAt(j)){
                    isunique = false;
                    break;
                }
            }
            if(isunique){
                return i;
            }
        }
        return -1;
        
    }
}