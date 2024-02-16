class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        for(int ar:arr){
            answer+=ar;
        }
        return answer/=arr.length;
    }
}