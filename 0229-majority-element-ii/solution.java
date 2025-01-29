class Solution {
    public static <T> List<T> convertSetToList(Set<T> set) {
        List<T> list = new ArrayList<>(); 
        for (T t : set) 
            list.add(t); 
        return list; 
    } 
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n= nums.length/3;
        for(int ele : nums){
            if(map.containsKey(ele)){
                int val = map.get(ele);
                map.put(ele,val+1);
            } else {
                map.put(ele,1);
            }
        }
        HashSet<Integer> set = new HashSet<>();
        for(int ele : nums){
            if(map.get(ele)>n){
                set.add(ele);
            }
        }
        List<Integer> list = convertSetToList(set); 
        return list;
    }
}
