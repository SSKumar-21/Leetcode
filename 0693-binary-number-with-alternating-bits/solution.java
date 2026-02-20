class Solution {
    public boolean hasAlternatingBits(int n) {
        String B = Integer.toBinaryString(n);
        for(int i=0;i<B.length() -1;i++){
            if(B.charAt(i) == B.charAt(i+1)){
                return false;
            }
        }
        return true;
    }
}
