class Solution {
    public String solution(String s) {
        String answer = "";
        boolean Check = true;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(Check == true){
                answer += Character.toUpperCase(c);
                Check = false;
            } else {
                answer += Character.toLowerCase(c);
            }
            
            if(c ==' '){
                Check = true;
            } 
        }
        return answer;
    }
}