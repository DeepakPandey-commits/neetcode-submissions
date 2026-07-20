class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int output[] = new int[n1];
        int k = 0;
        for(int i=0; i<n1; i++){
            for(int j=i+1; j<n2; j++){
                if(nums2[j]>nums1[i]){
                    output[k++] = nums2[j];
                    break;
                }
                else{
                    output[k++] = -1;
                }
            }
        }
        return output;
    }
}