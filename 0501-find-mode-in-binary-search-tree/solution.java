/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int[] findMode(TreeNode root) {
        HashMap<Integer,Integer> map = new HashMap<>();
        count(root,map);
        int max = 0;
        List<Integer> res = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if(max == value){
                res.add(key);
            }
            else if(max < value){
                res.clear();
                res.add(key);
                max = value;
            }
        }
        int[] arr = res.stream().mapToInt(i -> i).toArray();
        return arr;
    }
    private void count(TreeNode root, HashMap<Integer,Integer>map){
        if(root == null) return;

        if((map.containsKey(root.val))){
            map.put(root.val,1+map.get(root.val));
        } else {
            map.put(root.val,1);
        }
        count(root.left,map);
        count(root.right,map);
    }
}
