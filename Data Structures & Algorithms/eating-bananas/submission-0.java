class Solution {
    public int maxelement(int[] nums){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length; i++){
            max = Math.max(max , nums[i]);
        }
        return max;
    }
    public int totalhours(int[] nums , int hours){
        int totalhour = 0;
        int n = nums.length;
        for(int i=0; i<n ; i++){
            totalhour += Math.ceil((double)nums[i]/(double)hours);
        }
        return totalhour;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = maxelement(piles);
        int ans = Integer.MAX_VALUE;
        while(low<=high){
            int mid = low+(high-low)/2;
            int totalhour = totalhours(piles , mid);
            if(totalhour<=h){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
}
