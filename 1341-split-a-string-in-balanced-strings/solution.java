class Solution {
    public int balancedStringSplit(String s) {
        int count =0 ;
        int res =0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == 'R') count++;
            if(c=='L') count--;

            if(count==0) res++;

        }
        return res;
    }
}
