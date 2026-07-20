class Solution {
    public int count freq(int[] arr , int num){
        int counter = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == num){
                counter++;
            }
        }
        return counter;
    }
    public int findLucky(int[] arr) {
        for(int i=0; i<arr.length; i++){
            if(arr[i] == freq(arr , arr[i])){
                return arr[i];
            }
        }
        return -1;
    }
}