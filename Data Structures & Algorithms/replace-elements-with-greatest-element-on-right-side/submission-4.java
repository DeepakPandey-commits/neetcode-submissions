class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int l = arr[n-1];
        arr[n-1] = -1;
        for(int i = n-2; i>=0 ; i--){
            if(arr[i] > l){
                int t = arr[i];
                arr[i] = l;
                l = t;
            }else{
                arr[i] = l;
            }            
        }
        return arr;
    }
}