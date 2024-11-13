import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        ArrayList<Integer> answer = new ArrayList<>();
        Map<String, Integer> num = new HashMap<>(); // 장르별 저장횟수
        Map<String, HashMap<Integer, Integer>> music = new HashMap<>(); // 각 장르 노래 번호/재생
        
        for(int i=0; i<plays.length; i++){
            if(!num.containsKey(genres[i])){
                HashMap<Integer, Integer> map = new HashMap<>();
                map.put(i, plays[i]);
                music.put(genres[i], map);
                num.put(genres[i], plays[i]);
            } else {
                music.get(genres[i]).put(i, plays[i]);
                num.put(genres[i], num.get(genres[i]) + plays[i]);
            }
        }
        
        List<String> keySet = new ArrayList(num.keySet());
        Collections.sort(keySet, (s1, s2) -> num.get(s2) - (num.get(s1)));
        
        for(String key : keySet) {
            Map<Integer, Integer> map = music.get(key);
            List<Integer> genre_key = new ArrayList(map.keySet());
            
            Collections.sort(genre_key, (s1, s2) -> map.get(s2) - (map.get(s1)));
            
            answer.add(genre_key.get(0));
            if(genre_key.size() > 1){
                answer.add(genre_key.get(1));
            }
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}