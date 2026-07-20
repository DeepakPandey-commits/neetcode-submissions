class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
        int x = n/3;
        for(int i=0; i<n-1; i++){
            int count = 0;
            for(int j=0; j<n-1;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>=x){
                list.add(nums[i]);
            }else{
                continue;
            }
        }
        return list;
    }
}