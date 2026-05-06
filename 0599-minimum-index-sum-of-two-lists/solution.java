class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<list1.length;i++){
            map.put(list1[i],i);
        }


        Set<String> res = new HashSet<>();
        int max = 2000;
        for(int i=0;i<list2.length;i++){
            String str = list2[i];

            if(map.containsKey(str)){
                int idx = i + map.get(str);
                if(idx < max){
                    res.clear();
                    max= idx;
                    res.add(str);
                } 
                if (idx == max){
                    res.add(str);
                }
            }
        }
        return res.toArray(new String[0]);
    }
}
