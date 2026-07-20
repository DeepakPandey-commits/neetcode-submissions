class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0; 
        for(int i=0; i<flowerbed.length-1; i++){
            if(flowebed[i] != flowerbed[i+1]){
                count ++;
            }
        }
        if(count == n){
            return true;
        }
        return false;
    }
}