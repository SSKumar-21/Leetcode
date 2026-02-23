class Solution {
    public boolean hasAllCodes(String s, int k) {

        if (k > s.length()) return false;

        HashSet<Integer> set = new HashSet<>();
        int i = 0, j = i + k - 1;

        while (j < s.length()) {
            String b = s.substring(i, j + 1);   
            int n = Integer.parseInt(b, 2);    
            set.add(n);

            i++;  
            j++;
        }

        int total = 1 << k;   

        for (int x = 0; x < total; x++) {
            if (!set.contains(x)) {
                return false;
            }
        }

        return true;
    }
}
