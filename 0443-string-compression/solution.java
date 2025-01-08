class Solution {
    public int compress(char[] chars) {
        int index=0;
        int i=0;
        while(i<chars.length){
            char curr=chars[i];
            int c=0;
            while(i<chars.length && chars[i]==curr){
                i++;
                c++;
            }
            chars[index++]=curr;
            if(c>1){
                for(char ch : String.valueOf(c).toCharArray()){
                    chars[index++]=ch;
                }
            }
        }
        return index;
    }
}
