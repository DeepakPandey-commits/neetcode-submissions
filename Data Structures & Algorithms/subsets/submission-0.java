class Solution {
    public List<List<Integer>> sub(int nums[] ,List<List<Integer>> ans, int i){
        List<Integer> ans  = new ArrayList<>();
        if(i == numa.length-1){
            ans.add(nums[i]);
            return list;
        }
        sub(nums,ans.add(nums[i]) , i+1);
        sub(nums, ans, i+1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int i=0;
        return sub(nums, ans , i);
    }
}
