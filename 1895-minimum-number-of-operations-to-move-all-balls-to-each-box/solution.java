class Solution {
    public int[] minOperations(String boxes) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<boxes.length();i++){
            if(boxes.charAt(i)=='1'){
                list.add(i);
            }
        }

        int[] res=new int[boxes.length()];
        for(int i=0;i<boxes.length();i++){
            int c=0;
            for(int j: list){
                c+=Math.abs(j-i);
            }
            res[i]=c;
        }
        return res;
    }
}
