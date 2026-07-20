class Solution {
    public int maxNumberOfBalloons(String text) {
        int count = 0; 
        int countB = 0;
        int countA = 0;
        int countN = 0;
        int countL = 0;
        int countO = 0;
        for(int i=0; i<text.length(); i++){
            if(text.charAt(i)=='b'){
                countB++;
            }else if(text.charAt(i)=='a'){
                countA++;
            }else if(text.charAt(i)=='n'){
                countN++;
            }else if(text.charAt(i)=='l'){
                countL++;
            }else if(text.charAt(i)=='o'){
                countO++;
            }else{
                continue;
            }
        }
        while(countB>=1 && countA>=1&& countN>=1 && countL>=2 && countO >=2){
            count++;
            countB--;
            countA--;
            countN--;
            countL -=2;
            countO -=2;
        }
        return  count;
    }
}