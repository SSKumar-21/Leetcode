class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();

        comb(new ArrayList<>(), res, n, k, 0, 1);

        return res;
    }
    private void comb(List<Integer> l, List<List<Integer>> res, int n, int k, int size, int curr) {
        if(size == k){
            res.add(new ArrayList<>(l));
            return;
        }
        for(int i = curr;i<=n;i++){
            l.add(i);
            comb(l, res, n, k, size + 1, i + 1);
            l.remove(l.size() - 1);
        }
    }
}
