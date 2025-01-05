class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int[] arr=new int [s.length()+1];
        for(int[] sh : shifts){
            int start=sh[0];
			int end=sh[1];
			int dir=sh[2];
            arr[start]+= (dir == 1 ? 1 : -1) ;
            if(end+1 < s.length()){
                arr[end+1]-= (dir==1 ? 1 : -1);
            }
        } 

        int curr=0;
        for(int i=0;i<s.length();i++){
            curr+=arr[i];
            arr[i]=curr;
        }

        StringBuilder res = new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            int sh=(arr[i]%26 +26 )%26;
            res.setCharAt(i,(char)('a'+(s.charAt(i)-'a'+sh)%26));
        }

        return res.toString();
    }
}
