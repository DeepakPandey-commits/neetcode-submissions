class Solution {
    
    public int[] productExceptSelf(int[] nums) {

        int result[] = new int[nums.length];
        int ans = 1;
        int zerocount = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                zerocount ++;
            }else{
                ans *= nums[i];
            }
        }
        for(int i=0; i<nums.length; i++){
            if(zerocount >1){
                result[i] = 0;
            }else if(zerocount == 1){
                if(nums[i]==0){
                    result[i] = ans;
                }else{
                    result[i] =0;
                }
            }else{
                result[i] = ans/nums[i];
            }
        }
        return result;
    }
}  
