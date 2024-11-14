class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=2*n; i++){
            if(2*n%i==0 && i%2 !=0){
                answer ++;
            }
        }
        return answer;
    }
}