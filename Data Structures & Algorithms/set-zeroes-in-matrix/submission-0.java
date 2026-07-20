class Solution {
    public void setZero(int[][] matrix , int row , int col){
        //row
        for(int i=0; i<matrix.length; i++){
            matrix[i][col] = 0;
        }
        //col
        for(int j=0; j<matrix[0].length; j++){
            matrix[row][j] = 0;
        }
    }
    
    public void setZeroes(int[][] matrix) {
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    setZero(matrix , i , j);
                }
            }
        }
    }
}
