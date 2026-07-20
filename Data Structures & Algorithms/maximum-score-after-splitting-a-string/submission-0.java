class Solution {
    public int count0(String s){
        int count = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == "0"){
                count++;
            }
        }
        return count;
    }
    public int count1(String s){
        int count = 0 ;
        for(int i=0; i<s.length; i++){
            char ch = s.charAt(i);
            if(ch == "1"){
                count++;
            }
        }
        return count;
    }
    
    public int maxScore(String s) {
        int maxscore = Integer.MIN_VALUE;
        
        for(int i=0; i<s.length(); i++){
            
            String leftsubstring = s.substring(0,i);
            int count0 = count0(leftsubstring);
            String rightsubstring = s.substring(i+1 , s.length());
            int count1 = count1(rightsubstring);
            int sum = count0 + count1
            maxscore = Math.max(sum , maxscore);


            
        }
        return maxscore;
    }
}