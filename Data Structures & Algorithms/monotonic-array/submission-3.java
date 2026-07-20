class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean isInc = true;
        boolean isDec = true;
        for(iny i=0 ; i<nums.length-1 ; i++){
            if(arr[i] < arr[i+1]){
                isDec = false;
            }else if(arr[i] > arr[i+1]){
                isInc = false;
            }else{
                continue;
            }
        }
        if( isInc == true || isDec == true){
            return true;
        }
        return false;
    }
}