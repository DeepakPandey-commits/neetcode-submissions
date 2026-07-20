class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int leader = arr[n-1];
        arr[n-1] = -1;
        for(int i = n-2; i>=0 ; i--){
            if(arr[i] > leader){
                int temp = arr[i];
                arr[i] = leader;
                leader = temp;
            }else{
                arr[i] = leader;
            }            
        }
        return arr;
    }
}