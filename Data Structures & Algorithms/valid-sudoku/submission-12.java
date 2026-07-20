class Solution {
    public static boolean validsudoku(char[][] sudoku , int row , int col , char digit){
        // row check
        for(int j = 0 ; j<9 ; j++){
            if((j!=col)&&sudoku[row][j]==digit){
                return false;
            }
        }
        for(int i = 0 ; i<9 ; i++){
            if((i!=row)&&sudoku[i][col]==digit){
                return false;
            }
        }
        //gridcheck
        int sr = (row/3)*3;
        int sc = (col/3)*3;
        for(int i = sr ; i<sr+3 ; i++){
            for(int j = sc ; j<sc+3 ; j++){
                if((j!=col || i!=row )&& sudoku[i][j] == digit){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0 ; i<9 ; i++){
            for(int j = 0 ; j<9 ; j++){
                if(board[i][j] == '.'){
                    continue;
                }
                else if(validsudoku(board, i , j , board[i][j] )){
                    return true;
                }
            }
        }

        return false;
    }
}
