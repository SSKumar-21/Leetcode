class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> res= new ArrayList<>();
        int max=candies[0];
        for(int ele : candies){
            if(max<ele){
                max=ele;
            }
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies >= max){
                res.add(true);
            }
            else{
                res.add(false);
            }
        }
        return res;
    }
}
