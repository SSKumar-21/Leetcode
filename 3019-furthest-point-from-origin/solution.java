class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        long l = moves.chars()
                 .filter(ch -> ch == 'L')
                 .count();
        long r = moves.chars()
                 .filter(ch -> ch == 'R')
                 .count();
        long idk = moves.chars()
                 .filter(ch -> ch == '_')
                 .count();

        if (l > r) {
            return (int)Math.abs(l + idk - r);
        } 
        
        return (int)Math.abs(r + idk - l);
 
    }
}
