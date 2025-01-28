class Solution {
    public boolean checkRecord(String s) {
        int a=0,l=0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='L'){
                l++;
                if(l>=3){
                    return false;
                }
            } else if(c=='A'){
                a++;
                l=0;
            } else {
                l=0;
            }
        }
        if(a>=2){
            return false;
        }
        return true;
    }
}
