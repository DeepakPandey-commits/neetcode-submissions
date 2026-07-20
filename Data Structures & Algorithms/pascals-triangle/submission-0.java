class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {

            List<Integer> row = new ArrayList<>();

            // First and last element are always 1
            row.add(1);

            // Calculate middle elements
            for (int j = 1; j < i; j++) {
                int value = result.get(i - 1).get(j - 1) 
                          + result.get(i - 1).get(j);

                row.add(value);
            }

            // Add last 1 if row has more than 1 element
            if (i > 0) {
                row.add(1);
            }

            result.add(row);
        }

        return result;
    }
}