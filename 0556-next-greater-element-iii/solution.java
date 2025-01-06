class Solution {
    public int nextGreaterElement(int n) {
        int a=n;

        int size=0;
        while(a>0){
            size++;
            a/=10;
        }

        int[] arr=new int[size];
        a=n;
        for (int i=size-1;i>=0;i--){
            arr[i]= a%10;
            a/=10;
        }

        int i=size-2;
        while (i>=0 && arr[i] >= arr[i+1]){
            i--;
        }

        if (i<0) {
            return -1;
        }

        int j=size-1;
        while(arr[j]<=arr[i]){
            j--;
        }

        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

        int left=i+1,right=size-1;
        while (left<right) {
            temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }

        long res=0;
        for (int digit : arr) {
            res=res*10 + digit;
        }

        if (res>Integer.MAX_VALUE) {
            return -1;
        }

        return (int)res;
    }
}

