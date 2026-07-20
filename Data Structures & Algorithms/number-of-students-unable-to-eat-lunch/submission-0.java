class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        
        // Count students who prefer 0 and 1
        int[] count = new int[2];
        
        for (int student : students) {
            count[student]++;
        }

        // Check sandwiches one by one
        for (int sandwich : sandwiches) {
            
            // If no student wants this sandwich
            if (count[sandwich] == 0) {
                break;
            }

            // One student takes the sandwich
            count[sandwich]--;
        }

        // Remaining students
        return count[0] + count[1];
    }
}