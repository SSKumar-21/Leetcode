class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] res = new String[score.length];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<score.length;i++){
            map.put(score[i],i);
        }
        for (int i = 1; i < score.length; i++) {
            int key = score[i];
            int j = i - 1;
            while (j >= 0 && score[j] > key) {
                score[j + 1] = score[j];
                j--;
            }
            score[j + 1] = key;
        }
        int rank = 1;
        for(int i=score.length -1;i>=0;i--){
            int key = score[i];
            int index = map.get(key);
            if(rank == 1){
                res[index] = "Gold Medal";
            } else if (rank == 2){
                res[index] = "Silver Medal";
            } else if (rank == 3){
                res[index] = "Bronze Medal";
            } else {
                res[index] = "" + rank;
            } 
            rank++;
        }
        return res;
    }
}
