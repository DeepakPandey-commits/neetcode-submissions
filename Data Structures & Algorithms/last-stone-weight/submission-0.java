class Solution {
    public int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        for(int i=stones.length-1; i>=0; i--){
            if(stones[i] == stones[i-1]){
                stones[i] == 0;
                Arrays.sort(stones);
            }else if(stones[i] < stones [i-1]){
                stones[i] = stones[i] = stones[i-1];
                Arrays.sort(stones);
            }else{
                stones[i-1] = stones[i-1] - stones[i];
                Arrays.sort(stones);
            }
        }
        return stones[0];
    }
}
