class Solution {
    public int binaryGap(int n) {
        String b = Integer.toBinaryString(n);
        int res=0;
        int j,i;
        for(i=0;i<b.length()-1;i++){
            if(b.charAt(i) == '1'){
                j = i+1;
                while(j<b.length() && b.charAt(j)!='1'){
                    j++;
                }
                if(j<b.length()){
                    res = Math.max(res,j-i);
                }
            }
        }
        return res;
    }
}
