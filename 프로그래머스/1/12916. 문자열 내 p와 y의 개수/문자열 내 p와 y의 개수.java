class Solution {
    boolean solution(String s) {
        int cntp=0;
        int cnty=0;
        for(int i=0; i<s.length(); i++){
            if('p'==s.charAt(i)||'P'==s.charAt(i)){
                cntp++;
            }else if('y'==s.charAt(i)||'Y'==s.charAt(i)){
                cnty++;
            }
        }

        return cntp==cnty?true:false;
    }
}