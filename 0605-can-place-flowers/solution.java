class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int c=0;

        if(flowerbed.length==1){
            if(flowerbed[0]==0){
                flowerbed[0]=1;
                c++;
            }
            return c>=n;
        }

        if(flowerbed[0]==0 && flowerbed[1]!=1){
            flowerbed[0]=1;
            c++;
        }
        for(int i=1;i<flowerbed.length-1;i++){
            if(flowerbed[i]==0 && flowerbed[i-1]!=1 && flowerbed[i+1]!=1){
                flowerbed[i]=1;
                c++;
            }
        }
        if(flowerbed[flowerbed.length-1]==0 && flowerbed[flowerbed.length-2]!=1){
            flowerbed[flowerbed.length-1]=1;
            c++;
        }
        return c>=n;
    }
}
