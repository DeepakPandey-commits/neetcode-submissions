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
                    for(int m = 0 ; m<k; k++){
                        if(temp[m] == nums1[i]){
                            found = true;
                            break;
                        }
                    }
                    if(found == false){
                        temp[k] = nums1[i];
                        k++;
                    }
                }
            }
        }
        return temp;
    }
}