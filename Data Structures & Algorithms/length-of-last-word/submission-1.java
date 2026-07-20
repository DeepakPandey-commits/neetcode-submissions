class Solution {
    public int lengthOfLastWord(String s) {
        int i=s.length()-1;
        while(i>=0 && s.charAt(i)==' '){
            i--;
        }
        int end = i;
        while(i>=0 && s.charAt(i) != ' '){
            i--;
        }
        int start = i+1;
        String lastword = s.substring(start,end+1);
        return lastword.length()+1;
    }
}