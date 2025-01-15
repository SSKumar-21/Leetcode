class Solution {
    public int hIndex(int[] citations) {
        int n=citations.length;
        int[] arr= new int[n+1];

        for( int ele : citations){
            if(ele>=n){
                arr[n]++;
            } else {
                arr[ele]++;
            }
        }
        int sum=0;
        int i;
        for(i=n;i>=0;i--){
            sum+=arr[i];
            if(sum>=i){
                break;
            }
        }
        return i;
    }
}
