class Solution { // O(n) || O(n^2)
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char board[][] = new char[n][n];

        for(char row[] : board){
            Arrays.fill(row, '.');
        }
        backTrack(board, 0, result);
        return result;
    }

    private void backTrack(char board[][], int row, List<List<String>> result){
        // Base case
        if(row == board.length){
            result.add(solve(board));
            return;
        }
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';// place queen
                backTrack(board, row + 1, result); // backtrack
                board[row][col] = '.';// remove queen
            }
        }
    }

    private boolean isSafe(char[][] board, int row, int col){
        int n = board.length;
        // vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') return false;
        }

        // diagonal left up
        for (int i = row-1, j = col-1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        // diagonal right up
        for (int i = row-1, j = col+1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') return false;  // fixed
        }
        return true;
    }

    // convert board to List<String>
    private List<String> solve(char[][] board) {
        List<String> solution = new ArrayList<>();
        for (char[] row : board) {
            solution.add(new String(row));
        }
        return solution;
    }
}