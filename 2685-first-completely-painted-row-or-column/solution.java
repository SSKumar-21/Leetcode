class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        HashMap<Integer , int[]> map = new HashMap<>();
        int[] row = new int[mat.length];
        int[] col = new int[mat[0].length];
        Arrays.fill(row,mat[0].length);
        Arrays.fill(col,mat.length);
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                map.put(mat[i][j],new int[]{i,j});
            }
        }
        for(int i=0;i<arr.length;i++){
            int[] pos = map.get(arr[i]);
            if(--row[pos[0]] == 0 || --col[pos[1]]==0 ){
                return i;
            }
        }
        return -1;
    }
}
