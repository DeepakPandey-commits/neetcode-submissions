class Solution {
    public int freq(int[] arr , int num){
        int counter = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == num){
                counter++;
            }
        }
        return counter;
    }
    public int findLucky(int[] arr) {
        int MaxLucky = -1;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == freq(arr , arr[i])){
                MaxLucky = Math.max(MaxLucky , arr[i]);
            }
        }
        return MaxLucky;
    }
}