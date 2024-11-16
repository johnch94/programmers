import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i : scoville){
            pq.add(i);
        }
        int answer = 0; // 횟수
        while(pq.size() > 1 && pq.peek() < K){
            int first = pq.poll();
            int second = pq.poll();
            int newScoville = first + (2*second);
            pq.add(newScoville);
            answer++;
        }
        
        if(pq.peek() < K) return -1;
        
        return answer;
    }
}