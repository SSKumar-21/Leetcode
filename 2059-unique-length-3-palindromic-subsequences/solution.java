class Solution {
    public int countPalindromicSubsequence(String s) {
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
        }
        int res=0;
        for(char letter : set){
            int l=-1,r=-1;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==letter){
                    if(l==-1){
                        l=i;
                    }
                    r=i;
                }
            }
            HashSet<Character> st = new HashSet<>();
            for(int mid=l+1;mid<=r-1;mid++){
                st.add(s.charAt(mid));
            }
            res+=st.size();
        }
        return res;
    }
}
