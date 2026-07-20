class Solution {
    public long putMarbles(int[] weights, int k) {
        int n = weights.length;
        int m = n-1;
        int[] pairsum = new int[m-1];
        for(int i=0; i<m; i++){
            pairsum[i] = weights[i] + weights[i+1];
        }
        Arrays.sort(pairsum);

        long maxsum = 0;
        long minsum = 0;
        for(int i=0 ; i<k-1; i++){
            minsum += pairsum[i];
            maxsum +=pairsum[m-1-i];
        }
        return maxsum - minsum;
    }
}