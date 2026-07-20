class Solution {
    public int[] sortedSquares(int[] nums) {
        int arr[] = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            arr[i] = nums[i] * nums[i];
        }
        return Arrays.sort(arr);
    }
}