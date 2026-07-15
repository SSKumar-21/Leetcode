class Solution {
    public List<List<String>> solveNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        List<List<String>> res = new ArrayList<>();
        solve(0, n, board, res);
        return res;
    }

    private void solve(int row, int n, boolean[][] board, List<List<String>> res){
        if(row == n){
            List<String> temp = new ArrayList<>();
            for(int i = 0;i < n; i++){
                String str = "";
                for(int j = 0;j<n;j++){
                    if(board[i][j]){
                        str = str + "Q" ;
                    } else {
                        str = str + ".";
                    }
                }
                temp.add(str);
            }
            res.add(new ArrayList(temp));
        }

        for(int col = 0;col<n;col++){
            if(Check(row, col, board)){
                board[row][col] = true;
                solve(row+1, n, board, res);
                board[row][col] = false;
            }
        }
    }

    private boolean Check(int row, int col, boolean[][] board) {
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }
        for (int c = col, r = row; c >= 0 && r >= 0; c--, r--) {
            if (board[r][c]) {
                return false;
            }
        }
        for (int c = col, r = row; c < board.length && r >= 0; c++, r--) {
            if (board[r][c]) {
                return false;
            }
        }
        return true;
    }
}