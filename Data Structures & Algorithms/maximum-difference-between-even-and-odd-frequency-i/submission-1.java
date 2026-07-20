class Solution {
    public int maxodd(int nums[]){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i] %2 != 0){
                max = Math.max(nums[i] , max);
            }else{
                continue;
            }
        }
        return max;
    }
    public int mineven(int nums[]){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2 == 0 && nums[i]!= 0){
                min = Math.min(min , nums[i]);
            }else{
                continue;
            }
        }
        return min;
    }
    public int maxDifference(String s) {
        int freq[] = new int[26];
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            int index = ch -'a';
            freq[index] = freq[index]+1;

        }
        int max = maxodd(freq);
        int min = mineven(freq);
        return max-min;
    }
}