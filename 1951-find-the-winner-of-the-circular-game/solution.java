class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> q = new LinkedList<>();

        for(int i = 1;i <= n; i++) q.offer(i);

        while(q.size() > 1){
            int count = k - 1;
            while ( count != 0){
                int ele = q.poll();
                q.offer(ele);
                count--;
            }
            q.poll();
        }
        return q.poll();
    }
}
