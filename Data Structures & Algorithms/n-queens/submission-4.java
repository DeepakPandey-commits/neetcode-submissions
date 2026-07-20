class main{
    public static void printboard(char board[][]){
        for(int i = 0 ; i<board.length; i++){
            for(int j = 0 ; j<board.length ; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static boolean isSafe(char board[][] , int rows , int col){
        //vertical up
        for(int i = rows - 1; i>=0 ; i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //diganol vertical left
        for(int i = rows -1 , j = col - 1 ; i>=0 && j>=0 ; i-- , j--){
            if(board[i][j]=='Q'){
                return false ;
            }
        }
        //diagonal vertical right
        for(int i = rows -1 , j = col+1 ; i>=0 && j<board.length ; i-- , j++){
            if(board[i][j]=='Q'){
                return false ; 
            }
        }
        return true;
    }
    public static void  NQueens(char board[][] , int rows){
        //base case
        if(rows == board.length){
            printboard(board);
            return;
        }
        //recurssion
        for(int j = 0 ; j<board.length ; j++){
            if(isSafe(board , rows , j)){
                board[rows][j] = 'Q';
                NQueens(board , rows+1);
                board[rows][j] = '.';
            }
        }
    }
}