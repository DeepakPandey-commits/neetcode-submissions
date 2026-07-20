class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int output[] = new int[n1];
        for(int i=0; i<n1; i++){
            int index = -1;

            for(int j=0; j<nums2.length; j++){
                if(nums2[j] == nums1[i]){
                    index = j;
                    break;
                }
            }

            int nextgreater = -1;
            for(int j = index+1; j<nums2.length; j++){
                if(nums2[j]> nums1[i]){
                    nextgreater = nums2[j];
                    break;
                }
            }

            output[i] = nextgreater;
        }
        return output;
    }
    
}