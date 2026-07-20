class Solution {
    public int scoreOfString(String s) {
        int sum = 0;
        int slow = 0;
        int fast = 1;
        while(fast < s.length()){
            sum += ((int)s.charAt(slow) - (int)s.charAt(fast));
            slow++;
            fast++;
        }
        return sum;
    }
}