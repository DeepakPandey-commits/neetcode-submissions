class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> s = new Stack<>();
        int[] nextgreater = new int[nums1.length];
        for(int i=nums2.length-1; i>=0; i--){
            while(!s.isEmpty() && nums2[s.peek()]<=nums1[i]){
                s.pop();
            }if(s.isEmpty()){
                nextgreater[i] = -1;
            }else{
                nextgreater = nums2[s.peek()];
            }
            s.push(i);
        }
        return nextgreater;
    }
}