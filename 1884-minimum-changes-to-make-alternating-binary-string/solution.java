class Solution {
    public int minOperations(String s) {
        int res1 = 0;
        int res2 = 0;
        for(int i=0;i<s.length();i++){
            char x = s.charAt(i);
            if(i%2==0){
                if(x == '1') res1++;
            } else {
                if(x == '0') res1++;
            }
        }

        for(int i=0;i<s.length();i++){
            char x = s.charAt(i);
            if(i%2==0){
                if(x == '0') res2++;
            } else {
                if(x == '1') res2++;
            }
        }
        return Math.min(res1,res2);
    }
}
