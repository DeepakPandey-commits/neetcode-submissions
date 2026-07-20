class Solution {
    public int countSeniors(String[] details) {
        int c = 0;
        for(int i=0; i<details.length; i++){
            String s = details[i];
            
                String s1 = s.substring(11,13);
                int a = Integer.parseInt(s1);
                if(a>60){
                    count++;
                }
            
        }
        return c;
    }
}