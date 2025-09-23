class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] res = new int[friends.length];
        HashSet<Integer> set = new HashSet<>();
        for(int ele : friends){
            set.add(ele);
        }
        int i = 0;
        for(int ele: order){
            if(set.contains(ele)){
                res[i++] = ele;
            }
        }
        return res;
    }
}
