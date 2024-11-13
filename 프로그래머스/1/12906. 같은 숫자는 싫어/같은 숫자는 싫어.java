import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(arr[0]);
        int num = list.get(0); // 초기값
        
        for(int a:arr){
            if(num != a){
                list.add(a);
                num = a;
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}