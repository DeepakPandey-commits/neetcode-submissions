class Solution {
    public static boolean isSafe(char Sudoku[][] , int row , int col , char digit){
        //row
        for(int j = 0 ; j<9 ; j++){
            if(Sudoku[row][j] == digit){
                return false;
            }
        }
         for(int i = 0 ; i<9 ; i++){
            if(Sudoku[i][col] == digit){
                return false;
            }
        }
        int sr = (row/3)*3;
        int sc = (col/3)*3;
        for(int i = sr ; i<sr+3 ; i++){
            for(int j = sc ; j<sc+3 ; j++){
                if(Sudoku[i][j] == digit){
                return false;
                }
            }
        }
        return true;
    }
    public static boolean SudokuSolver(char Sudoku[][] , int row , int col){
        if(row == 9){
            return true;
        }
        for(char digit = '1' ; digit<= '9' ; digit++){
            if(isSafe(Sudoku , row , col , digit)){
                Sudoku[row][col] = digit;
                if(SudokuSolver(Sudoku , nextrow , nextcol)){
                    return true ;
                }
                Sudoku[row][col] = '0';
            }
        }
        return false;
    }
    public boolean isValidSudoku(char[][] board) {
        SudokuSolver(Sudoku , 0 , 0);
    }
}
