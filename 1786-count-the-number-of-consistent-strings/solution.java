class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set = new HashSet<>();
        for(int i=0 ; i<allowed.length() ;i++){
            set.add(allowed.charAt(i));
        }
        int res = 0;
        for(String word : words){
            boolean check =true;
            for(int i=0 ; i<word.length() ;i++){
                char ch = word.charAt(i);
                if(!set.contains(ch)){
                    check = false;
                    break;
                }
            }
            if(check){
                res++;
            }
        }
        return res;
    }
}
