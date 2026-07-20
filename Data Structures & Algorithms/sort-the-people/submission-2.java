class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        for(int turn = 0; turn<heights.length; turn++){
            for(int j=0; j<heights.length-1-turn;j++){
                if(heights[j]<heights[j+1]){
                    int temp = heights[j];
                    String var = names[j];
                    

                    heights[j] = heights[j+1];
                    names[j] = names[j+1];

                    heights[j+1] = temp;
                    names[j+1] = var;
                }
            }
        }
        return names;
    }
}