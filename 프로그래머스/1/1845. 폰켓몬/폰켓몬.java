import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int max = nums.length/2;
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        return max>set.size() ? set.size() : max;
    }
}