class Solution {
    public int countStudents(int[] s, int[] sand) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int ele: s) map.put(ele, map.getOrDefault(ele , 0) + 1);

        int res = 0;
        for(int ele: sand){
            int val = map.getOrDefault(ele, 0);
            if(val == 0) break;
            map.put(ele, val - 1);
        }
        return map.getOrDefault(0, 0) + map.getOrDefault(1, 0);
    }
}
