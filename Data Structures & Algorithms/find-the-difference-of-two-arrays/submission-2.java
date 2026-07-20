class Solution {
    public static boolean isdistinct(int[] arr , int num){
        boolean isthere = false;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==num){
                isthere = true;
            }
        }
        return isthere;
    }
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> list = new ArrayList<>();

        List<Integer> first = new ArrayList<>();
        
        for(int i=0;i<nums1.length; i++){
            if(!isdistinct(nums2 , nums1[i]) && !first.contains(nums1[i])){
                
                first.add(nums1[i]);
            }else{
                continue;
            }
        }
        List<Integer> second = new ArrayList<>();
        
        for(int i=0; i<nums2.length; i++){
            if(!isdistinct(nums1 , nums2[i]) && !second.contains(nums2[i])){
                
                second.add(nums2[i]);
            }else{
                continue;
            }
        }
        list.add(first);
        list.add(second);
        return list;
    }
}