class Solution {
    public static boolean validsudoku(char[] sudoku , int row , int col , int digit){
        // row check
        for(int j = 0 ; j<9 ; j++){
            if(sudoku[row][j]==digit){
                return false;
            }
        }
        for(int i = 0 ; i<9 ; i++){
            if(sudoku[i][col]==digit){
                return false;
            }
        }
        //gridcheck
        int sr = (row/3)*3;
        int sc = (col/3)*3;
        for(int i = sr ; i<sr+3 ; i++){
            for(int j = sc ; j<sc+3 ; j++){
                if(sudoku[i][j] == digit){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        int row = 0;
        int col = 0 ; 
        int nextrow = row , nextcol = col+1;
        if(nextcol+1 == 9){
            nextrow = row +1;
            nextcol = 0;
        }
        for(int digit = "1" ; digit<="9" ; digti++){
            if(validsudoku(sudoku ,nextrow , nextcol , digit ) == true){
                return true;
            }
        }
        return false;
        
    }
}
