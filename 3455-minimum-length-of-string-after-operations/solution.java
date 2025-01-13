class Solution {
    public int minimumLength(String s) {
        int[] arr=new int[26];
        Arrays.fill(arr,0);
        for(int i=0;i<s.length();i++){
            int key=(int)(s.charAt(i)-'a');
            arr[key]++;
        }
        int len=0;
        for(int i=0;i<26;i++){
            while(arr[i]>2){
                arr[i]=arr[i]-2;
            }
            len+=arr[i];
        }
        return len;
    }
}
