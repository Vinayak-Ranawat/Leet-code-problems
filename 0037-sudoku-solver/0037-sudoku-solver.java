class Solution { // O(9^empty cells) - 9*9*9 => 9
    public boolean isSafe(char[][] board, int row, int col, char dig){
        // horizontal
        for(int j=0; j<9; j++){
            if(board[row][j] == dig){
                return false;
            }
        }

        // vertical
        for(int i=0; i<9; i++){
            if(board[i][col] == dig){
                return false;
            }
        }

        // drid
        int srow = (row/3)*3;
        int scol = (col/3)*3;

        for(int i=srow; i<=srow+2; i++){
            for(int j=scol; j<=scol+2; j++){
                if(board[i][j] == dig){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean helper(char[][] board, int row, int col){
        if(row == 9){
            return true;
        }

        int nxtRow = row, nxtCol = col+1;
        if(nxtCol == 9){
            nxtRow = row+1;
            nxtCol = 0;
        }
        if(board[row][col] != '.'){
            return helper(board, nxtRow, nxtCol);
        }

        // place the digit
        for(char dig='1'; dig<='9'; dig++){
            if(isSafe(board, row, col, dig)){
                board[row][col] = dig;
                if(helper(board, nxtRow, nxtCol)){
                    return true;
                }
                board[row][col] = '.';
            }
        }
        return false;
    }
    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }
}