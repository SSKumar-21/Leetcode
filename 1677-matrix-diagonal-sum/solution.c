int diagonalSum(int** mat, int matSize, int* matColSize) {
    int sum=0;
    for(int i=0;i<matSize;i++){
        sum+=mat[i][i];
        if(matSize-1-i!=i){
            sum+=mat[i][matSize-1-i];
        }
    }
    return sum;
}
