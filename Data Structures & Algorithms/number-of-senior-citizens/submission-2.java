class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(int i=0; i<details.length; i++){
            String str = details[i];
            for(int j=0;j<=15;j++){
                String age = str.substring(12,14);
                int num =Integer.parseInt(age);
                if(num>60){
                    count++;
                }
            }
        }
        return count;
    }
}