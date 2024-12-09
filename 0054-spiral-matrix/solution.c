/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* spiralOrder(int** matrix, int matrixSize, int* matrixColSize, int* returnSize) {
    *returnSize = matrixSize * (*matrixColSize);
    int* res = malloc((*returnSize) * sizeof(int));
    int sr = 0, sc = 0;
    int er = matrixSize - 1;
    int ec = *matrixColSize - 1;
    int index = 0;

    while (sr <= er && sc <= ec) {
        for (int i = sc; i <= ec; i++) {
            res[index++] = matrix[sr][i];
        }
        sr++;
        for (int i = sr; i <= er; i++) {
            res[index++] = matrix[i][ec];
        }
        ec--;
        if (sr <= er) {
            for (int i = ec; i >= sc; i--) {
                res[index++] = matrix[er][i];
            }
            er--;
        }
        if (sc <= ec) {
            for (int i = er; i >= sr; i--) {
                res[index++] = matrix[i][sc];
            }
            sc++;
        }
    }
    return res;
}

