class Solution {
    public String kthDistinct(String[] arr, int k) {
        StringBuilder str = new StringBuilder(" ");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(i==j){
                    continue;
                }
                if(arr[i]==arr[j] && i == (k-1)){
                    str.append(arr[i]);
                }
                
            }
        }
        return str.toString();
    }
}