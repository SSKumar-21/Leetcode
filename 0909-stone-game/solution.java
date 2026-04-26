class Solution {
    public boolean stoneGame(int[] piles) {
        int e =0;
        int o=0;
        for(int i=0;i<piles.length;i++){
            if (i%2 == 0) e+=piles[i];
            else o+=piles[i];
        }

        if(e > o){
            return true;
        }
        return true;
    }
}
