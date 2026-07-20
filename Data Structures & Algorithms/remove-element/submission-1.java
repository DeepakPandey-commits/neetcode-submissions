class Solution {
    public int removeElement(int[] nums, int val) {
        int arr[] = new int[]
        int k=0;
        for(int i=0; i<arr.length-1; i++){
            if(nums[i] != val){
                arr[k] = arr[i];
                k++;
            }
            
        }
        return k;
        
    }
}