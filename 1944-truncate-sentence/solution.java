class Solution {
    public String truncateSentence(String s, int k) {
        String res = "";
        int i = 0,j=0;
        while(i<k && j<s.length()){
            if(s.charAt(j) == ' '){
                i++;
            }
            if(i==k){
                break;
            }
            res = res + s.charAt(j);
            j++;
            
        }
        return res;
    }
}
