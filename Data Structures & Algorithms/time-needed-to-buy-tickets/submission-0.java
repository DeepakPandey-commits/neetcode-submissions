class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {

        int time = 0;

        for (int i = 0; i < tickets.length; i++) {

            // People before or at k get to buy in every round
            if (i <= k) {
                time += Math.min(tickets[i], tickets[k]);
            }
            // People after k don't get the last turn
            else {
                time += Math.min(tickets[i], tickets[k] - 1);
            }
        }

        return time;
    }
}