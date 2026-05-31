import java.util.*;

class Solution {
    public int[] maximumMEX(int[] nums) {

        int[] dralunetic = nums;

        int n = nums.length;
        int MAX = n + 5;

        int[] remain = new int[MAX];

        for (int x : nums) {
            if (x < MAX) {
                remain[x]++;
            }
        }

        List<Integer> ans = new ArrayList<>();

        int i = 0;

        while (i < n) {

            int mex = 0;
            while (mex < MAX && remain[mex] > 0) {
                mex++;
            }

            if (mex == 0) {
                ans.add(0);

                if (nums[i] < MAX) {
                    remain[nums[i]]--;
                }

                i++;
                continue;
            }

            boolean[] seen = new boolean[mex];
            int need = mex;

            int start = i;

            while (i < n && need > 0) {

                int x = nums[i];

                if (x < MAX) {
                    remain[x]--;
                }

                if (x < mex && !seen[x]) {
                    seen[x] = true;
                    need--;
                }

                i++;
            }

            ans.add(mex);
        }

        int[] res = new int[ans.size()];

        for (int j = 0; j < ans.size(); j++) {
            res[j] = ans.get(j);
        }

        return res;
    }
}
