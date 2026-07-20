class Solution {
    public static void binarysearch(int nums[] , int target){
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target == nums[mid]){
                return mid;
            }else if(nums[mid]<target){
                start = mid +1;
            }else{
                end = mid -1;
            }
        }
        return -1;
    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
        int i = 1;
        int j=0;
        while(j<n-1){
            if(i == binarysearch(nums,i)){
                i++;
                continue;
            }else{
                list.add(i);
                i++;
            }
        }
        return list;
    }
}