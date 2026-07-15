class Solution {
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        for(int i = 0;i<n;i++){
            for(int j=0;j<m;j++){
                if (solve(0 ,i, j, board, word)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean solve (int idx, int row, int col,char[][] board, String word){

        if(idx == word.length()){
            return true;
        }

        if(row < 0 || row >= board.length || col < 0 || col >= board[0].length ) {
            return false;
        }

        if (board[row][col] != word.charAt(idx)){
            return false;
        }
        
        char curr = word.charAt(idx);
        board[row][col] = '.';

        boolean l = solve(idx + 1 ,row, col-1, board, word);
        boolean r = solve(idx + 1 ,row, col+1, board, word);
        boolean t = solve(idx + 1 ,row-1, col, board, word);
        boolean b = solve(idx + 1 ,row+1, col, board, word);

        board[row][col] = curr;

        return l || r || t || b ; 

    }
}