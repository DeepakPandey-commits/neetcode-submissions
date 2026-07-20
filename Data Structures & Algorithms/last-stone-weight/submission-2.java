class Solution {
    public int lastStoneWeight(int[] stones) {
        int n = stones.length;
        while(n>1){
            Arrays.sort(stones , 0 , n);

            int largest = stones[n-1];
            int secondlargest = stones[n-2];

            if(secondlargest != largest){
                stones [n-2] = secondlargest - largest ;
            }else{
                stones[n-2] = 0;
            }
            n--;
        }
        return stones[0];
    }
}
