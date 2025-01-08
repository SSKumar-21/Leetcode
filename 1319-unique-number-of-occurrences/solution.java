class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                int val = map.get(arr[i]);
                map.put(arr[i],val+1);
            } else {
                map.put(arr[i],1);
            }
        }
        for(int value : map.values()) { 
            if(set.contains(value)){ 
                return false;
            } else {
                set.add(value); 
            }
        }
        return true;
    }
}
