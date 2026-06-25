class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> res = new ArrayList<>();
        int c = 1;
        for (int ele: target){
            while (c < ele) {
                res.add("Push");
                res.add("Pop");
                c++;
            }

            res.add("Push");
            c++;   
        }
        return res;
    }
}
