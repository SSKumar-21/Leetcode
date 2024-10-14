int findLucky(int* arr, int arrSize) {
       int check[501]={0},x=-1;
    for (int i=0;i<arrSize;i++){
        check[ arr[i] ] ++;
    }
    for(int i=0;i<arrSize;i++){
        if(check[arr[i]]==arr[i] && x<arr[i]){
            
            x=arr[i];
        }
    }
    return x;
}
