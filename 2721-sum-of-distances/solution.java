class Solution {
    public long[] distance(int[] nums) {
        int n = nums.length;
        long[] res = new long[n];

        Map<Integer, List<Integer>> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        for (List<Integer> pos : map.values()) {
            long sum = 0;
            for(int ele : pos) sum += ele;

            long lsum = 0;
            int m = pos.size();

            for(int i =0 ;i< m ;i++){
                long rSum = sum - lsum - pos.get(i);

                long left  = (long) pos.get(i) * i - lsum;
                long right = rSum - (long) pos.get(i) * (m - i - 1);

                res[pos.get(i)] = left + right;

                lsum += pos.get(i);
            }
        }
        return res;
    }
}
