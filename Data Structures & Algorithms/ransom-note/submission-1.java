class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];
        for(char ch:magazine.toCharArray()){
            count[ch-'a']++;
        }
        for(char ch:ransomNote.toCharArrya()){
            count[ch-'a']--;
            if(char[ch-'a']<0){
                return false;
            }
        }
        return true;
    }
}