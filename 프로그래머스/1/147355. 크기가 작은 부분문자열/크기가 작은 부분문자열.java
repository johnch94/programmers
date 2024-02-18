class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int Tlen = t.length();
        int Plen = p.length();
        
        for(int i=0; i<(Tlen-Plen)+1; i++){
            if(Long.parseLong(t.substring(i,i+Plen))
               <=Long.parseLong(p)){
                answer+=1;
            }
        }
        
        return answer;
    }
}