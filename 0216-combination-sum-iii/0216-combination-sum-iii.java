class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        solve(k, n, temp, res, 0);
        return res;
    }
    private void solve(int k, int sum, List<Integer> temp, List<List<Integer>> res, int idx){
        if(temp.size() == k ){
            if(sum == 0){
                res.add(new ArrayList(temp));
            }
        }

        for(int i = idx + 1; i < 10 ; i++){
            if (sum >= i){
                temp.add(i);
                solve(k, sum - i, temp,res,i);
                temp.remove(temp.size() - 1);
            }
        }
    }
}