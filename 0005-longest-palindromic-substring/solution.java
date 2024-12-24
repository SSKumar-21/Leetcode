class Solution {
    public boolean palindrome(String s,int i,int j){
        while(i<j){
            if(s.charAt(i) != s.charAt(j) ){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public String longestPalindrome(String s) {
        int max=0,start=0,end=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(palindrome(s,i,j) == true){
                    if(max<(j-i+1)){
                        max=j-i+1;
                        start=i;
                        end=j;
                    }
                }
            }
        }
        return s.substring(start,end+1);
    }
}
