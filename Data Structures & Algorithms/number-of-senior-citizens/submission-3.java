class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(int i=0; i<details.length; i++){
            String str = details[i];
            
                String age = str.substring(11,13);
                int num = Integer.parseInt(age);
                if(num>60){
                    count++;
                }
            
        }
        return count;
    }
}