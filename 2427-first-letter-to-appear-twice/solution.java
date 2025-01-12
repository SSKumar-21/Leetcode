class Solution {
    public char repeatedCharacter(String s) {
        int[] arr = new int[26];
        Arrays.fill(arr,0);
        int i=0;
        for(i=0; i<s.length();i++){
            int key = (int)(s.charAt(i) - 'a');
            arr[key]++;
            if(arr[key]>1){
                break;
            }
        }
        return s.charAt(i);
    }
}
