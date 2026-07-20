class Solution {
    
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] temp = new int[nums1.length+nums2.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                temp[k] = nums1[i];
                i++;
                
            }else{
                temp[k] = nums2[j];
                j++;
                
            }
            k++;
        }
        while(i<nums1.length){
            temp[k] = nums1[i];
            i++;
        }
        while(j<nums2.length){
            temp[k] = nums2[j];
            j++;
        }
        int l = temp.length;

        if(temp.length %2 == 0){
            double x = (double) temp[((temp[l/2]+temp[(l/2)+1]))/2];
            return x;
        }else{
            double y = (double)temp[(l+1)/2];
            return y;
        }

    }
    
}
