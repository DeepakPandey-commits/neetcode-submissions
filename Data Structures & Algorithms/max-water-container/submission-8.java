class Solution {
    public int maxArea(int[] heights) {
        int lp=0;
        int rp=heights.length-1;
        int maxwater = Integer.MIN_VALUE;
        while(lp<rp){
            int width = rp-lp;
            int ht = Math.min(heights[lp] , heights[rp]);
            int CurrArea = width*ht;
            maxwater = Math.max(CurrArea , maxwater);

            if(heights[lp]<heights[rp]){
                lp++;
            }else{
                rp--;
            }
        }
        return maxwater;
    }
}
