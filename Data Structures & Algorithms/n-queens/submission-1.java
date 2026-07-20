class Main {

    static int n;
    static char[][] board;
    static boolean[] cols;
    static boolean[] diag1;   // row - col
    static boolean[] diag2;   // row + col

    public static void solve(int row) {
        // base case
        if (row == n) {
            printBoard();
            return;
        }

        for (int col = 0; col < n; col++) {
            int d1 = row - col + n;
            int d2 = row + col;

            if (cols[col] || diag1[d1] || diag2[d2]) {
                continue;
            }

            // place queen
            board[row][col] = 'Q';
            cols[col] = diag1[d1] = diag2[d2] = true;

            solve(row + 1);

            // backtrack
            board[row][col] = 'X';
            cols[col] = diag1[d1] = diag2[d2] = false;
        }
    }

    public static void printBoard() {
        System.out.println("--------CHESS BOARD---------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        n = 4;
        board = new char[n][n];

        cols = new boolean[n];
        diag1 = new boolean[2 * n];
        diag2 = new boolean[2 * n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }

        solve(0);
    }
}
