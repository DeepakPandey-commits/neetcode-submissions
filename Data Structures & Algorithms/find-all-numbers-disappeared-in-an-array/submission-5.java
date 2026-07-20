class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
        for(int j=1; j<=n; j++){
            boolean iffound = false;
            for(int i=0; i<n; i++){
                if(j == nums[i] ){
                    iffound = true;
                    break;
                    
                }
                
            }
            if(!iffound){
                list.add(j);
            }
        }
        return list;
    }
}