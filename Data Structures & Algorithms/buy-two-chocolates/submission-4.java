class Solution {
    public int buyChoco(int[] prices, int money) {
        int lowest = Integer.MAX_VALUE;
        int low = Integer.MAX_VALUE;
        for(int i=0; i<prices.length; i++){
            if(prices[i]<=lowest){
                low = lowest;
                lowest = prices[i];
            }else if(prices[i]<low){
                low = prices[i];
            }
        }
        int totalprice = lowest + low;

        return totalprice<=money? money-totalprice : money;
    }
}