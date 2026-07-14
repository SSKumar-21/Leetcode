class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        solve(0, temp, res, s);
        return res;
    }

    private void solve(int idx, List<String> temp, List<List<String>> res, String s) {
        if(s.length() == idx){
            res.add(new ArrayList(temp));
            return;
        }
        for(int i = idx;i<s.length();i++){
            String strNew = s.substring(idx, i + 1);
            if(p(strNew)){
                temp.add(strNew);
                solve(i+1,temp,res,s);
                temp.remove(temp.size()-1);
            }
        }
    }

    private boolean p(String s) {
        if (s == null) {
            return false;
        }

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}