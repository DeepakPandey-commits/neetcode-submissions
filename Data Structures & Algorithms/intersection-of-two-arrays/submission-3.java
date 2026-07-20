class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int x = nums1.length;
        int y = nums2.length;
        int temp[] = new int[Math.min(x,y)];
        int k = 0;
        for(int i=0; i<x; i++){
            for(int j = 0; j<y; j++){
                if(nums1[i] == nums2[j]){
                    
                    boolean found = false;
                    for(int m = 0 ; m<k; m++){
                        if(temp[m] == nums1[i]){
                            found = true;
                            break;
                        }
                    }
                    if(!found){
                        temp[k] = nums1[i];
                        k++;
                    }
                }
            }
        }
        int result[] = new int[k];
        for(int i=0; i<k; i++){
            result[i] = temp[i];
        }
        return result;
    }
}