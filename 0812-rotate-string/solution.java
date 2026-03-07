class Solution {
    public boolean rotateString(String s, String goal) {
        int window = goal.length();
        int n= s.length();

        if(n!=window) return false;
        s = s+s;
        n= s.length();

        int i=0,j=i+window;
        while(j<=n){
            String sub = s.substring(i,j);
            if(goal.equals(sub)) return true ;
            i++;
            j++;
        }
        return false;
    }
}
