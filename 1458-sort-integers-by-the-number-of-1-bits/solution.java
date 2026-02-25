class Solution {
    public int[] sortByBits(int[] arr) {
        int[][] mat = new int[arr.length][2];
        for(int i=0;i<arr.length;i++){
            int ele = arr[i];
            String b = Integer.toBinaryString(ele);
            int len = b.replace("0", "").length();;
            mat[i][0] = len;
            mat[i][1] = ele;
        }
        Arrays.sort(mat, (x, y) -> {
            if (x[0] == y[0]) {
                return x[1] - y[1];
            }
            return x[0] - y[0];
        });
        for (int i = 0; i < arr.length; i++) {
            arr[i] = mat[i][1];
        }

        return arr;
        
    }
}
