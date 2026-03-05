class Solution {
    public int findPermutationDifference(String s, String t) {

        HashMap<Character,Integer> sMap = new HashMap<>();
        HashMap<Character,Integer> tMap = new HashMap<>();
        int res =0 ;
        for(int i = 0;i<s.length();i++){
            sMap.put(s.charAt(i),i);
            tMap.put(t.charAt(i),i);
        }

        for(int i = 0;i<s.length();i++){
            res += Math.abs(sMap.get(s.charAt(i)) - tMap.get(s.charAt(i)));
        }
        return res; 

    }
}
