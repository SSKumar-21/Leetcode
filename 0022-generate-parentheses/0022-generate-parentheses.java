class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        solve(n, 0, 0, res, "");
        return res;
    }
    private void solve(int n,int open, int close,List<String> res, String temp){
        if(open == n && close == n){
            res.add(temp);
            return;
        }
        if(open < n){
            solve(n, open + 1, close, res, temp + "(");
        }
        if(close < open){
            solve(n, open, close + 1, res, temp + ")");
        }

    }
}