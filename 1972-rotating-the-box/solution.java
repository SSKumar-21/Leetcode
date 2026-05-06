class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        int n = boxGrid.length;
        int m = boxGrid[0].length;

        char[][] res = new char[m][n];

        for (int i = 0; i < n; i++) {

            int empty = m - 1;

            for (int j = m - 1; j >= 0; j--) {

                if (boxGrid[i][j] == '*') {
                    res[j][n - 1 - i] = '*';
                    empty = j - 1;
                }

                else if (boxGrid[i][j] == '#') {
                    res[empty][n - 1 - i] = '#';
                    empty--;
                }
            }

            for (int j = empty; j >= 0; j--) {
                if (res[j][n - 1 - i] == '\0') {
                    res[j][n - 1 - i] = '.';
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (res[i][j] == '\0') {
                    res[i][j] = '.';
                }
            }
        }

        return res;
    }
}
