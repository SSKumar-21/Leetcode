class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        String res="";
        for(String str : arr){
            String w="";
            for(int i=str.length()-1;i>=0;i--){
                w += str.charAt(i);
            }
            res+=w + " ";
        }
        return res.trim();
    }
}
