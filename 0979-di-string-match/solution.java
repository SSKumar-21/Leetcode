class Solution {
    public int[] diStringMatch(String s) {
        int[] arr = new int[s.length()+1];
        int I = 0;
        int D = s.length();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'I'){
                arr[i]= I++ ;
            } else {
                arr[i]= D--;
            }
        }
        if(s.charAt(s.length()-1) == 'I'){
            arr[s.length()]= I++ ;
        } else {
            arr[s.length()]= D--;
        }
        return arr;
    }
}
