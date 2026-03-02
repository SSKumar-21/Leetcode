class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for(int i=2;i<=n-2;i++){
            if(!checking(n,i)){
                return false;
            }
        }
        return true;
    }
    private boolean checking(int n, int base) {

    StringBuilder converted = new StringBuilder();

    // Convert number to given base
    while (n > 0) {
        int rem = n % base;
        converted.append(rem);
        n = n / base;
    }

    // Check palindrome
    String s = converted.toString();
    int left = 0;
    int right = s.length() - 1;

    while (left < right) {
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }
        left++;
        right--;
    }

    return true;
}

}
