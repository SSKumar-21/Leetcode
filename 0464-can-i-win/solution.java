class Solution {
        public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        if(desiredTotal <= maxChoosableInteger) return true;
        if((1+maxChoosableInteger) *maxChoosableInteger/2 < desiredTotal) return false;
        Map<Integer, Boolean> map = new HashMap<>();
        return dfs(maxChoosableInteger, desiredTotal, 0, map);
        
    }
    
    private boolean dfs(int max, int desired, int bitmask, Map<Integer, Boolean> map) {
        if(desired <= 0) return false;
        if(map.containsKey(bitmask)) return map.get(bitmask);
        for(int i = 1; i<=max; i++) {
// to check if we have visit before
            if((bitmask | 1 << i) == bitmask) continue;
            if(!dfs(max, desired - i, (bitmask|1<<i), map)) {
                map.put(bitmask, true);
                return true;
            }
        }
        map.put(bitmask, false);
        return false;
    }
}
