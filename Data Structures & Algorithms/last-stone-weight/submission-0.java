class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone : stones){
            q.offer(stone);
        }

        while(q.size()>1){
            int first = q.poll();
            int second = q.poll();
            if(first != second){
                q.offer( first> second ? first-second: second-first);
            }
        }
        if(q.size() ==1){
            return q.poll();
        }
        return 0;
    }
}
