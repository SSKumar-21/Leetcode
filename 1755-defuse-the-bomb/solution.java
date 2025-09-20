class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] res = new int[code.length] ;
    
        if(k==0){
            for(int i=0;i<code.length;i++){
                res[i] = 0;
            }
        }

        if(k>0){
            for(int i=0;i<code.length;i++){
                int sum = 0;
                for(int j = 1; j <= k; j++){
                    int index = (i+j)%(code.length) ;
                    sum += code[index];
                }
                res[i] = sum;
            }
        }

        if(k<0){
            k = Math.abs(k);
            for(int i=0;i<code.length;i++){
                int sum = 0;
                for(int j = 1; j <= k; j++){
                    int index = Math.abs((code.length+i-j))%(code.length) ;
                    sum += code[index];
                }
                res[i] = sum;
            }
        }
        return res;
    }
}
