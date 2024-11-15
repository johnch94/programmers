class Solution {
    public int solution(int n) {
        int answer = 0;
        String s1 = Integer.toString(n,2);
        int count = counter(n);
        int i=n;
        while(n<1000000){
            i++;
            if(counter(i)==count){
                answer = i;
                break;
            }
        }
        
        return answer;
    }
    
    public int counter(int n){
        String s = Integer.toString(n,2);
        int counter =0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='1'){
                counter++;
            }
        }
        return counter;
    }
}