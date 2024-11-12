import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] nums) {
        int max = nums.length/2; // 최대 선택 갯수
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        return max > set.size() ? set.size() : max;
    }
}