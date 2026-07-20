class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder str = new StrinBuilder(" ");
        int length = word1.length() + word2.length();
        int i = 0;
        int j = 0;
        str.append(word1.charAt(i));
        i++;
        str.append(word2.charAt(j));
        j++;
        return str.ToString();
    }
}