class Solution {
    public static int maxindex(int arr[]){
        int maxind = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] > arr[maxind]){
                maxind = i;
            }
        }
        return maxind;
    }
    public static int maxvalue(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            max = Math.max(arr[i] , max);
        }
        return max;
    }
    public static long sum(int arr[]){
        long sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    public long pickGifts(int[] gifts, int k) {
        for(int i=0; i<k; i++){
            int maxindex = maxindex(gifts);
            int maxvalue = maxvalue(gifts);
            int sqrtvalue = (int)Math.sqrt(maxvalue);
            gifts[maxindex] = sqrtvalue;
            
        }
        return sum(gifts);

    }
}