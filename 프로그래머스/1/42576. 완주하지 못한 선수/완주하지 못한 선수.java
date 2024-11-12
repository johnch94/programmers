import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        
        // map 에 참가자 담기
        for(String part : participant){
            if(map.containsKey(part)){
                map.put(part, map.get(part)+1);
            } else{
                map.put(part, 1);
            }
        }
        
        // completion 빼기
        for(String comp : completion){
            map.put(comp, map.get(comp)-1);
            if(map.get(comp) == 0){
                map.remove(comp);
            }
        }
        
        // 출력
        for(String s : map.keySet()){
            sb.append(s);
        }
        return sb.toString();
    }
}