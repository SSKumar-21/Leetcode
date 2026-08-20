class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();

        a1.add(nums[0]);
        a2.add(nums[1]);
        int i = 2;

        while(i < nums.length){
            int a1Last = a1.get(a1.size() -1);
            int a2Last = a2.get(a2.size() -1);

            if (a1Last > a2Last){
                a1.add(nums[i]);
            } else {
                a2.add(nums[i]);
            }
            i++;
        }

        a1.addAll(a2);
        int[] res = a1.stream().mapToInt(Integer::intValue).toArray();

        return res;
    }
}