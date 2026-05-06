class Solution {
    public String getHint(String secret, String guess) {
        int bull = 0;
        int cow = 0;

        int[] set = new int[10];

        for(int i=0;i<secret.length();i++){
            if(secret.charAt(i) == guess.charAt(i)) bull++ ;
            else {
                if (set[secret.charAt(i) - '0']++ < 0) cow++ ;
                if (set[guess.charAt(i) - '0']-- > 0) cow++ ;
            }
        }
        return bull + "A" + cow + "B" ;
    }
}
