class Solution {
    public String largestNumber(int[] nums) {
        int n=nums.length;
        String[] str = new String[n];
        for(int i=0; i<n; i++){
            str[i] = Integer.toString(nums[i]);
        }
        Arrays.sort(str , new Comparator<>(){
            public int compare(String a , String b){
                String first  = a+b;
                String second = b+a;
                return second.compareTo(first);
            }
        });
        if(str[0].equals("0")){
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for(String val : str){
            sb.append(val);
        }
        return sb.toString();
    }
}