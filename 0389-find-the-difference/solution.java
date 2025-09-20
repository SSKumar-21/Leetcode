class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        char res = ' ';
        for(char ele: t.toCharArray()){
            if(map.containsKey(ele)){
                int count = map.get(ele);
                map.put(ele, count+1);
            } else {
                map.put(ele,1);
            }
        }
        for(char ele: s.toCharArray()){
            int count = map.get(ele);
            if (count > 0){
                map.put(ele,count-1);
            }
        }
        for(char ele: t.toCharArray()){
            if(map.get(ele)>0){
                res = ele;
                break;
            }
        }
        return res;
    }
}
