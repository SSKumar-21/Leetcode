class Solution {
    public boolean hasMatch(String s, String p) {
        int i=p.indexOf('*');
        int l=s.indexOf(p.substring(0, i));
        int r=s.indexOf(p.substring(i + 1), l+i);
        if (l!=-1 && r!=-1) {
            return true;
        }
        return false;
    }
}
