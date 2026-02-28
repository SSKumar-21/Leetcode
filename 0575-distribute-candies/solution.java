class Solution {
    public int distributeCandies(int[] candyType) {
        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int i=0;i<candyType.length;i++){
        //     int n = candyType[i];
        //     if(map.containsKey(n)) {
        //         int c = map.get(n);
        //         map.put(n,c+1);
        //     } else {
        //         map.put(n,c+1);
        //     }
        // }
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<candyType.length;i++){
            set.add(candyType[i]);
        }
        int types = set.size();
        return Math.min(types, candyType.length/2);
    }
}
