class Solution {
    public int countDigits(int num) {
        int temp=num;
        int size=0;
        while (temp>0){
            size++;
            temp/=10;
        }
        temp=num;
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=temp%10;
            temp/=10;
        }
        int res=0;
        for(int i=0;i<size;i++){
            if(num%arr[i]==0){
                res++;
            }
        }
        return res;
    }
}
