int uniquePaths(int m, int n) {
     int *row = malloc(n * sizeof(int));
    for (int j = 0; j < n; j++){ 
        row[j] = 1;
        }
    for (int i = 1; i < m; i++) {
        for (int j = 1; j < n; j++) row[j] += row[j - 1];
    }
    int result = row[n - 1];
    free(row);
    return result;
}
