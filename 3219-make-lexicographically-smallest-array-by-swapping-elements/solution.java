class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
            int[] sort = new int[nums.length];
            int i=0;
            for(int ele : nums){
                sort[i++]=ele;
            }
            Arrays.sort(sort);
            HashMap<Integer, Integer> Group = new HashMap<>();
            HashMap<Integer, LinkedList<Integer>>groupMember = new HashMap<>();
            int groupKey = 0; 
            Group.put(sort[0], groupKey);
            groupMember.put(groupKey, new LinkedList<Integer>(Arrays.asList(sort[0])));

            for(i=1;i<nums.length;i++){
                if(Math.abs(sort[i]-sort[i-1])>limit){
                    groupKey++;
                }
                Group.put(sort[i], groupKey);
                if(!groupMember.containsKey(groupKey)){
                    groupMember.put(groupKey, new LinkedList<Integer>());
                }
                groupMember.get(groupKey).add(sort[i]);
            }
            for(i=0; i<nums.length; i++){
                int groupNumber = Group.get(nums[i]);
                nums[i] = groupMember.get(groupNumber).pop();
            }
        return nums;
    }
}
