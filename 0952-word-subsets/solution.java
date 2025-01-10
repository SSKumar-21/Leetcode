class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] freq = new int[26];
        int[] max = new int[26];
        int k=0;

        Arrays.fill(freq, 0);
        Arrays.fill(max, 0);

        ArrayList<String> res = new ArrayList<>();

        for(int i=0;i<words2.length;i++){
            String s = words2[i];
            for(int j=0;j<s.length();j++){
                k= (int)(s.charAt(j) - 'a');
                freq[k]++;
                max[k]=Math.max(freq[k],max[k]);
            }
            Arrays.fill(freq, 0);
        }

        for(int i=0;i<words1.length;i++){
            String s = words1[i];
            for(int j=0;j<s.length();j++){
                k= (int)(s.charAt(j) - 'a');
                freq[k]++;
            }

            boolean c=true;
            for(int j=0;j<26;j++){
                if(max[j]>freq[j]){
                    c=false;
                    break;
                }
            }
            if(c==true){
                res.add(s);
            }
            Arrays.fill(freq, 0);
        }
        return res;
    }
}
