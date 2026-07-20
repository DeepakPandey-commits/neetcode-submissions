class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
        int x = n/3;
        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=0; j<;j++){
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