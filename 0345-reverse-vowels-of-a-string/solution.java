class Solution {
    public String reverseVowels(String s) {
        String v = "AEIOUaeiou";
		char[] arr=s.toCharArray();
        int i=0,j=arr.length-1;
        while(i<j){
            while(i<j && !v.contains(String.valueOf(arr[i]))){
                i++;
            }
            while(i<j && !v.contains(String.valueOf(arr[j]))){
                j--;
            }
            if(i<j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
            }
        }
        String res = new String(arr);
		return res;
    }
}
