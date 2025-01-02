class Solution {
    public int[] vowelStrings(String[] words,int[][] queries) {
        int n=words.length;
        int[] Pr=new int[n+1];
        Set<Character> vo=new HashSet<>(Arrays.asList('a','e','i','o','u'));
        for(int i=0;i<n;i++) {
            Pr[i+1]=Pr[i];
            if(vo.contains(words[i].charAt(0)) && vo.contains(words[i].charAt(words[i].length()-1))) {
                Pr[i+1]++;
            }
        }
        int[] res=new int[queries.length];
        for(int i=0;i<queries.length;i++) {
            res[i]=Pr[queries[i][1]+1]-Pr[queries[i][0]];
        }
        return res;
    }
}
