class Solution {
    public long putMarbles(int[] weights, int k) {
        int n = weights.length;
        if(k==1){
            retutrn 0;
        }
        
        int[] pairsum = new int[n-1];
        for(int i=0; i<n-1; i++){
            pairsum[i] = weights[i] + weights[i+1];
        }
        Arrays.sort(pairsum);

        long maxsum = 0;
        long minsum = 0;
        for(int i=0 ; i<k-1; i++){
            minsum += pairsum[i];
            maxsum +=pairsum[n-2-i];
        }
        return maxsum - minsum;
    }
}