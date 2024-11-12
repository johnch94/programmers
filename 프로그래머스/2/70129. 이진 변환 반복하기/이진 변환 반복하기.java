class Solution {
    public int[] solution(String s) {
        int[] answer = {0,0};
        int a = 0; //반복횟수
        int b = 0; //제거한 0의 갯수
        String result = s;
        while (!result.equals("1")) {
            a++;
        
            StringBuilder str = new StringBuilder();
            for (int i = 0; i < result.length(); i++) {
               char c = result.charAt(i);
                if (c == '1') {
                    str.append("1");  // 1만 추가
                } else {
                    b++;  // 0이면 제거한 0 갯수 증가
                }
            }
        
            // str에 1의 개수로 새로운 이진수 계산
            result = Integer.toString(str.length(), 2);  // 1의 개수를 이진수로 변환
        }
    
    answer[0] = a;
    answer[1] = b;
    return answer;
    }
}