class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int arr[] = new int[arr1.length];
        int k = 0;
        for(int i=0; i<arr2.length; i++){
            for(int j = 0; j<arr1.length;i++){
                if(arr1[i] == arr2[j]){
                    arr[k] = arr2[j];
                    k++;
                }else{
                    arr[k] = arr2[j];
                    k++;
                }
            }
        }
        return arr;
    }
}