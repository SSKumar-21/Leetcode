class Solution {
    public List<String> validStrings(int n) {
        List<String> res = new ArrayList<>();
        res.add("0");
        res.add("1");
        if(n==1) return res;
        for(int i =2;i<=n;i++){
            List<String> temp = new ArrayList<>();
            for(int j=0;j<res.size();j++){
                String str = res.get(j);
                if(str.charAt(str.length()-1) == '1'){
                    temp.add(str+'0');
                    temp.add(str+'1');
                } else {
                    temp.add(str+'1');
                }
            }
            res = temp;
        }
        return res;
    }
}
