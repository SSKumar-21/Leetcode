class Solution {
    public int candy(int[] ratings) {
        int[] can=new int[ratings.length];
        int sum=0;
        Arrays.fill(can,1);
        for(int i=1;i<ratings.length;i++){
            if(ratings[i-1]<ratings[i]){
                can[i]=can[i-1]+1;
            }
        }
        for(int i=ratings.length-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                can[i]=Math.max(can[i],can[i+1]+1);
            }
        }
        for(int ele : can){
            sum+=ele;
        }

        return sum;
    }
}
