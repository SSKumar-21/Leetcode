class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int ele: nums){
            set.add(ele);
        }
        int[] arr = new int[set.size()];
        int i = 0;
        for (int val : set) {
            arr[i++] = val;
        }

        if(arr.length==1){
            return arr[0];
        } 
        if(arr.length==2){
            if(arr[0] >= arr[1]){
                return arr[0];
            } else {
                return arr[1];
            }
        } 

        int l1 = -2147483648,l2 = -2147483648,l3 = -2147483648;
        for(i=0;i<arr.length;i++){
            int ele = arr[i];
            if(l3 < ele){
                if(l2 < ele){
                    if(l1 < ele){
                        l3 = l2;
                        l2 = l1;
                        l1 = ele;
                    } else {
                        l3 = l2;
                        l2 = ele;
                    }
                } else {
                    l3 = ele;
                }
            }
        }
        return l3;
    }
}
