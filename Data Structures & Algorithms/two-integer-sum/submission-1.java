// import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int arr[] = new int[2];
        int k=0;
        int lp=0;
        int rp=target.length-1;
        while(lp<rp){
            if(nums[lp] + nums[rp] == target){
                arr[k++] = lp;
                arr[k++] = rp;
            }else if(nums[lp] + nums[rp] < target){
                lp++;
            }else{
                rp--;
            }
        }
        return arr;

    }
}
