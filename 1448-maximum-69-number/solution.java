class Solution {
    public int maximum69Number (int num) {
        String str = "" + num ;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '6') {
                StringBuilder sb = new StringBuilder(str);
                sb.setCharAt(i, '9');
                str = sb.toString();
                break;
            }
        }
        return Integer.parseInt(str);
    }
}
