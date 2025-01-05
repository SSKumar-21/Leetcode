class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
    for(int i=0;i<accounts.length;i++){
        int rich=0;
        for(int j=0;j<(accounts[i].length);j++){
            rich+=accounts[i][j];
        }
        if(max<rich){
            max=rich;
        }
    }
    return max;
    }
}
