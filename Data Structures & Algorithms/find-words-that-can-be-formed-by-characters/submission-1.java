class Solution {
    public boolean canform(String words , String chars){
        int[] freq = new int[26];
        for(int i=0; i<chars.length(); i++){
            freq[chars.charAt(i) - 'a']++;
        }
        for(int i=0; i<words.length(); i++){
            char s = words.charAt(i);
            if(freq[s - 'a'] == 0){
                return false;
            }
            freq[s-'a']--;
        }
        return true;
    }
    public int countCharacters(String[] words, String chars) {
        int count =  0;
        for(int i = 0; i<words.length; i++){
            if(canform(words[i] , chars)){
                count += words[i].length();
            }else{
                continue;
            }
        }
        return count;
    }
}