class Solution {
    public int percentageLetter(String s, char letter) {
        double c=0;
        int i;
        for(i=0;i<s.length();i++){
            if(s.charAt(i)==letter){
                c++;
            }
        }
        double res=(c/s.length())*100;
        return (int)res;
    }
}
