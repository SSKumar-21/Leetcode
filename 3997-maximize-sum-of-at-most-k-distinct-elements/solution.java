class Solution {
    public int[] maxKDistinct(int[] nums, int k) {

        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i < nums.length ; i++){
            set.add(nums[i]);
        }

        int i=0;
        int[] arr = new int[set.size()];

        for(int ele: set){
            arr[i] = ele;
            i++;
        }

        for(i=0; i < arr.length ; i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && key<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        int[] res = new int[k];

        if(k>=arr.length){
            i=0;
            int j = arr.length -1;
            while(i<=j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            return arr;
        } else {
            for(i=1; i<=k ; i++){
                res[i-1] = arr[arr.length - i];
            }
        }
        return res;
    }
}
