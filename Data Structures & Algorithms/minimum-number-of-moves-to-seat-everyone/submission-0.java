class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int moves = 0;
        int i = 0;
        int j = 0;
        while(i<seats.length && j<students.length){
            students[j] = seats[i];
            moves += Math.abs(seats[i]-students[i])
            i --;
            j--;
        }
        return moves;
    }
}