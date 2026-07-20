class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<strs.length-1; i++){
            String s1 = strs[i];
            String s2 = strs[i+1];
            if(s1.charAt(i) ==s2.charAt(i)){
                sb.append(s1.charAt(i));
            }else{
                sb = "";
            }
        }
        return sb.toString();
    }
}