class Solution {
    public String solution(String s) {
        String answer = "";
        String[] array = s.split(" ");
        int m = Integer.parseInt(array[0]);
        int M = Integer.parseInt(array[0]);
        int tmp;
        for(int i=0; i<array.length; i++){
            tmp = Integer.parseInt(array[i]);
            if(tmp<=m){
                m = tmp;
            }
            if(M<=tmp){
                M = tmp;
            }
        }
        return ""+m+" "+M;
    }
}