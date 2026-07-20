class Solution {
    public int removeElement(int[] nums, int val) {
        int arr[] = new int[nums.length]
        int k=0;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] != val){
                arr[k] = nums[i];
                k++;
            }
            
        }
        return k;
        
    }
}