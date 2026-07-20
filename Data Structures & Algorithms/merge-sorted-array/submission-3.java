class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int array[] = new int[m+n];
        int a=0;
        int i=0;
        int j=0;
        int k = m-1;
        int l = n-1;
        while(i<=k && j<=l){
            if(nums1[i]>nums2[j]){
                array[a++] = nums2[j++];
            }else{
                array[a++] = nums1[i++];
            }
        }
        while(i<=k){
            array[a++] = nums1[i++];
        }
        while(j<=l){
            array[a++] = nums2[j++];
        }
        for(int x=0; x<m+n; x++){
            nums1[x] = array[x];
        }
    }
}