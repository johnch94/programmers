class Solution {
    public long solution(long n) {
        long answer = 0;
        long cnt=0;
        for(int i=0; cnt<n; i++){
            cnt = (long)i*i;
            if(n==cnt){
                answer = (long)Math.pow(i+1,2);
                break;
            }else{
                answer = -1;
            }
        }
        return answer;
    }
}