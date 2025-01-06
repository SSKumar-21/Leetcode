class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int size=(matrix.length) * (matrix[0].length);
        int[]res=new int [size];
        int index=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                res[index++]=matrix[i][j];
            }
        }
        Arrays.sort(res);
        while(k>size){
            k--;
        }
        return res[k-1];
    }
}
