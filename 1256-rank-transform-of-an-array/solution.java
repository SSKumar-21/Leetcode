class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[][] temp=new int[arr.length][2];

        for(int i=0;i<arr.length;i++){
            temp[i][0]=arr[i];
            temp[i][1]=i;
        }

        Arrays.sort( temp, new Comparator<int[]>() {public int compare(int[] a, int[]b){return Integer.compare(a[0], b[0]); }});

        int[] res=new int[arr.length];

        int rank=1;

        for (int i=0;i< arr.length;i++) {
            if (i>0 && temp[i][0] != temp[i-1][0]) {
                rank++;
            }
            res[temp[i][1]] = rank;
        }
        return res;
    }
}
