class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();

        gen(0, 0, "", n, res);

        return res;
    }
    private void gen(int open,int close,String str, int n,List<String> res){
        if (open == close && open + close == n * 2) {
            res.add(str);
            return;
        }

        if (open < n) {
            gen(open + 1, close, str + "(", n, res);
        }

        if (open > close){
            gen(open, close + 1, str + ")", n, res);
        }

    }
}
