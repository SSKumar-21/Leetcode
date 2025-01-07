class Solution {
    public List<String> stringMatching(String[] words) {
        ArrayList<String> res = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<words.length;i++){
            String key = words[i];
            for(int j=0;j<words.length;j++){
                if(i!=j && words[j].contains(key)){
                    set.add(key);
                }
            }
        }
        for(String ele : set){
            res.add(ele);
        }
        return res;
    }
}
