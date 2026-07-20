class Solution {
    public int maxelmnt(int nums[]){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            max = Math.max(max , nums[i]);
        }
        return max;
    }
    public int sumarray(int nums[]){
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
        }
        return sum;
    }
    public int func(int[] weight , int cap){
        int days = 1;
        int load = 0;
        for(int i=0; i<weight.length; i++){
            if((load + weight[i])>cap){
                days = days+1;
                load = weight[i];
            }else{
                load += weight[i];
            }
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        for(int i = maxelmnt(weights); i<= sumarray(weights); i++){
            int daysreq = func(weights , i);
            if(daysreq <= days){
                return i;
            }
        }
        return -1;
    }
    
}