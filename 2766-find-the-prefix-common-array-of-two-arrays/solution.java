class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] res=new int[A.length];
        for(int i=0;i<A.length;i++){
            boolean check= false;
            for(int j=0;j<B.length;j++){
                if(A[i]==B[j]){
                    check=true;
                }
                if(j>=i && check){
                    res[j]++;
                }
            }
        }
        return res;
    }
}
