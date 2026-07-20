class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.lenght;
        for(int j=1; j<=n; j++){
            for(int i=0; i<n; i++){
                if(j == nums[i] ){
                    continue;
                }else{
                    list.add(j);
                }
            }
        }
        return list;
    }
}