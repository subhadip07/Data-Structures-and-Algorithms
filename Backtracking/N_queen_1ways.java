public class N_queen_1ways {
    static int count = 0;

    public static boolean isSafe(char[][] board, int row, int col) {
        // Check vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check diagonal left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check diagonal right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static boolean Nqueen(char[][] board, int row) {
        if (row == board.length) {
            // All queens are placed successfully, print the board
            PrintBoard(board);
            count++;
            return true;
        }

        // Attempt to place a queen in each column of the current row
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q'; // Place queen
                if (Nqueen(board, row + 1)) {
                    return true; // Uncomment this if you want to find only the first solution
                }
                board[row][j] = 'X'; // Backtracking, remove the queen
            }
        }
        return false;
    }

    public static void PrintBoard(char[][] board) {
        System.out.println("------------------- Chess Board ----------------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 4; // Size of the board (N x N)
        char[][] board = new char[n][n];
        
        // Initialize the board with 'X' indicating empty spaces
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }

        // Attempt to solve the N-Queens problem
        if (Nqueen(board, 0)) {
            System.out.println("Solution is possible.");
        } else {
            System.out.println("Solution is not possible.");
        }

        System.out.println("Total solutions found: " + count);
    }
}
