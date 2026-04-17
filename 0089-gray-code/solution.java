class Solution {
    public List<Integer> grayCode(int n) {

        List<String> b = new ArrayList<>();

        gray(n, b);

        List<Integer> res = new ArrayList<>();

        for (String bStr : b) {
            res.add(Integer.parseInt(bStr, 2));
        }

        return res;
    }

    private void gray(int n, List<String> res) {

        if (n == 0) {
            res.add("0");
            return;
        }

        if (n == 1) {
            res.add("0");
            res.add("1");
            return;
        }

        gray(n - 1, res);

        int size = res.size();

        for (int i = size - 1; i >= 0; i--) {
            res.add(res.get(i));
        }

        for (int i = 0; i < size; i++) {
            res.set(i, "0" + res.get(i));
        }

        for (int i = size; i < res.size(); i++) {
            res.set(i, "1" + res.get(i));
        }
    }
}
