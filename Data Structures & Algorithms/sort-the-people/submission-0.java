class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        for(int turn = 0; turn<height.length; turn++){
            for(int j=0; j<height.length-1-turn;j++){
                if(heights[j]<heights[j+1]){
                    int temp = heights[j];
                    String var = names[j];
                    

                    heights[j] = height[j+1];
                    names[j] = names[j+1];

                    height[j+1] = temp;
                    names[j+1] = var;
                }
            }
        }
    }
}