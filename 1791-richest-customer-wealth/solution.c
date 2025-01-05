int maximumWealth(int** accounts, int accountsSize, int* accountsColSize) {
    int max=0;
    for(int i=0;i<accountsSize;i++){
        int rich=0;
        for(int j=0;j<(*accountsColSize);j++){
            rich+=accounts[i][j];
        }
        if(max<rich){
            max=rich;
        }
    }
    return max;
}
