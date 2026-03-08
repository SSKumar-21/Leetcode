class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums[0].length();
        HashSet<String> set = new HashSet<>(Arrays.asList(nums));
        String b = "";
        for(int i=0;i<=n*n;i++){
            b = Integer.toBinaryString(i);
            if(b.length() != n){
                b = lenning(b,n - b.length());
            }
            if(!set.contains(b)){
                break;
            }
        }
        return b;
        
    }
    private String lenning(String b,int n){
        while(n!=0){
            b = '0' + b;
            n--;
        }
        return b;
    }
}
