class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int n = deck.length;
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<n;i++) q.offer(i);

        int[] res = new int[n];
        for(int ele : deck){
            int i = q.poll();
            res[i] = ele;
            if(!q.isEmpty()){
                q.offer(q.poll());
            }
        }
        return res;
    }
}
