class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }

    private boolean solve(char[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == '.') {
                    for (int val = 1; val <= 9; val++) {
                        if (check(val, row, col, board)) {
                            board[row][col] = (char) (val + '0');
                            if (solve(board))
                                return true;
                            else
                                board[row][col] = '.';
                        }
                    }

                    return false;
                }
            }
        }

        return true;
    }

    private boolean check(int val, int row, int col, char[][] board) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == (char) (val + '0')) {
                return false;
            }
        }
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == (char) (val + '0')) {
                return false;
            }
        }

        int rs = (row / 3) * 3;
        int cs = (col / 3) * 3;

        for (int i = rs; i < rs + 3; i++) {
            for (int j = cs; j < cs + 3; j++) {
                if (board[i][j] == (char) (val + '0'))
                    return false;
            }
        }

        return true;
    }
}