class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int lp = 0;
        int rp = numbers.length-1;
        while(lp < rp){
            if(numbers[lp] + numners[rp] == target){
                return lp , rp;
            }
            else if(number[lp] + numbers[rp] < target){
                lp++;
            }else{
                rp--;
            }
        }
    }
}
