class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n =nums.length;
        for(int i=0;i<n;i++){
            int c;
            if(map.containsKey(nums[i])) c = c = map.get(nums[i]) + 1;
            else c = 1;
            map.put(nums[i],c);
        }


        HashMap<Integer, Integer> updatedMap = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            if (value >= 2) {
            updatedMap.put(key, value - 2);
            arr.add(key);
            arr.add(key);
            } else if (value == 1) {
                updatedMap.put(key, 0); 
                arr.add(key);
            }
        }
        map = updatedMap;
        Collections.sort(arr);

        ArrayList<Integer> temp = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            while(value>0){
                temp.add(key);
                value -- ;
            }
        }
        Collections.sort(temp);

        int i=0;
        for(i=0;i<arr.size();i++){
            nums[i] = arr.get(i);
        }
        int res = i;
        for(;i<temp.size();i++){
            nums[i] = temp.get(i);
        }
        return res;

    }
}
