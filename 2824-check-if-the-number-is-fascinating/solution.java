class Solution {
    public boolean isFascinating(int n) {
       HashSet<Integer> set = new HashSet<>();
       int x=n;
       while(x>0){
        if(!set.contains(x%10)){
            set.add(x%10);
        }
        else{
            return false;
        }
        if(x%10==0){
            return false;
        }
        x/=10;
       }
       x=2*n;
       while(x>0){
        if(!set.contains(x%10)){
            set.add(x%10);
        }else{
            return false;
        }
        if(x%10==0){
            return false;
        }
        x/=10;
       }
       x=3*n;
       while(x>0){
        if(!set.contains(x%10)){
            set.add(x%10);
        }else{
            return false;
        }
        if(x%10==0){
            return false;
        }
        x/=10;
       }
       return true;
    }
}
