class Solution {
    public int repeatingnumber(int grid[][]){
        
        int ans = -1;
        for(int i=0;i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){                
                int count =0;
                for(int x=0;x<grid.length;x++ ){                    
                    for(int y=0;y<grid[0].length; y++){
                        if(grid[i][j] == grid[x][y]){
                            count++;
                            ans = grid[i][j];
                        }
                    }
                }
                if(count>1){
                    return ans;
                }
            }                   
        }
        return ans;
    }
    public int missingnumber(int grid[][]){
        int sum = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                sum += grid[i][j];
            }
        }
        
        int sum2 = 0;
        int n =  grid.length;
        int total = n*n;
        for(int i=1; i<=total; i++){
            sum2 += i;
        }
        int diff = sum2-sum;
        return diff;
    }
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int ans[] = new int[2];
        ans[0] = repeatingnumber(grid);
        ans[1] = missingnumber(grid);
        return ans;
    }
}