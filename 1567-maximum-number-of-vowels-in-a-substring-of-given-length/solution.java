class Solution {
    public int maxVowels(String s, int k) {
       HashSet<Character> set = new HashSet <>();
       set.add('a'); 
       set.add('e');
       set.add('i');
       set.add('o');
       set.add('u');
       int max=0;
       int c=0;
       for(int i=0;i<k;i++){
            if(set.contains(s.charAt(i))){
                c++;
            }
       }
        max=c;
        for(int i=k;i<s.length();i++){
            if(set.contains(s.charAt(i-k))){
                c--;
            }
            if(set.contains(s.charAt(i))){
                c++;
            }
            max=Math.max(max,c);
        }
       return max;
    }
}
