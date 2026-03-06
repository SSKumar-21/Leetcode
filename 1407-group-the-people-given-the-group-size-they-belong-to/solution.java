class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int n = groupSizes.length;

        for(int i = 0; i < n; i++){
            if(map.containsKey(groupSizes[i])){
                List<Integer> temp = map.get(groupSizes[i]);
                temp.add(i);
                map.put(groupSizes[i], temp);
            } else {
                List<Integer> temp = new ArrayList<>();
                temp.add(i);
                map.put(groupSizes[i], temp);
            }
        }

        List<List<Integer>> res = new ArrayList<>();

        Iterator<Map.Entry<Integer, List<Integer>>> iterator = map.entrySet().iterator();

        while(iterator.hasNext()){
            Map.Entry<Integer, List<Integer>> entry = iterator.next();
            int key = entry.getKey();
            List<Integer> val = entry.getValue();

            for(int i = 0; i < val.size(); i += key){
                List<Integer> temp = new ArrayList<>();
                for(int j = i; j < i + key && j < val.size(); j++){
                    temp.add(val.get(j));
                }
                res.add(temp);
            }
        }

        return res;
    }
}
