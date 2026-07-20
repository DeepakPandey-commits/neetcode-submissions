class Solution {
    public List<String> commonChars(String[] words) {
        List<String> str = new ArrayList<>();
        for(int i=0; i<words.length; i++){
            String word = words[i];
            for(int j=0; j<word.length(); j++){
                char ch = word.charAt(j);
                if(!str.contain(ch)){
                    str.add(ch);
                }else{
                    continue;
                }
            }
        }
        return str;
    }
}