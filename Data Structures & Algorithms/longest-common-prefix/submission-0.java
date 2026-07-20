class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder new = "";
        for(int i=0; i<strs.length-1; i++){
            String s1 = strs[i];
            String s2 = strs[i+1];
            if(s1.charAt(i) ==s2.charAt(i)){
                new.append(s1.charAt(i));
            }else{
                new = "";
            }
        }
        return new.toString();
    }
}