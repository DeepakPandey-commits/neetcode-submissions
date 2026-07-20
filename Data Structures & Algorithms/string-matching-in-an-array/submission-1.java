class Solution {
    public List<String> stringMatching(String[] words) {
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<words.length; i++){
            for(int j=0; j<words.length; j++){
                int x= 0;
                if(i==j){
                    continue;
                }else if(words[i].substring(x,words[i].length())== words[j]){
                    list.add(words[i]);
                }else{
                    x++;
                }
            }
        }
        return list;
    }
}