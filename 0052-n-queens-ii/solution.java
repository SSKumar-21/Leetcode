class Solution {

    public boolean isSafe(int row, int col, char[][] board){
        // horizontal
        for(int j = 0; j < board.length; j++){
            if(board[row][j] == 'Q'){
                return false;
            }
        }

        // vertical
        for(int i = 0; i < board.length; i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        // upper left diagonal
        int r = row;
        for(int c = col; c >= 0 && r >= 0; c--, r--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        // upper right diagonal
        r = row;
        for(int c = col; c < board.length && r >= 0; c++, r--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        // lower left diagonal
        r = row;
        for(int c = col; c >= 0 && r < board.length; c--, r++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        // lower right diagonal
        r = row;
        for(int c = col; c < board.length && r < board.length; c++, r++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }

        return true;
    }

    int count = 0;

    public void helper(char[][] board, int col){
        if(col == board.length){
            count++;
            return;
        }

        for(int row = 0; row < board.length; row++){
            if(isSafe(row, col, board)){
                board[row][col] = 'Q';
                helper(board, col + 1);
                board[row][col] = '.';
            }
        }
    }

    public int totalNQueens(int n) {

        char[][] board = new char[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = '.';
            }
        }

        helper(board, 0);
        return count;
    }
}
