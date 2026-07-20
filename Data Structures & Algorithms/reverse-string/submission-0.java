class Solution {
    public void reverseString(char[] s) {
        StringBuilder sb = new StringBuilder("");
        char ch;
        for(int i=0; i<s.length(); i++){
            ch = s.charAt(i);
            sb.append(ch);
        }
    }
}