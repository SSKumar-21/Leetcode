class Solution {
    public int maxScore(String s) {
    int zero=0,one=0,max=0;
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='1'){
            one++;
        }
    }
    for(int i=0;i<s.length()-1;i++){
        if(s.charAt(i)=='0'){
            zero++;
        }
        else{
            one--;
        }
        max= (zero+one)>max ? zero+one : max ;
    }
    return max;
    }
}
