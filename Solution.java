import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        //create hashmap
        //key is complement and value is the index
        HashMap<Integer,Integer> complementMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            // if the value is not inside the complement map, then add the complement
            // key is complement, value is the index
            Integer complementIndex = complementMap.get(nums[i]);
            if(complementIndex != null){
                System.out.println("complement index found: " + complementIndex);
                int[] arr =new int[]{i, complementIndex};
                System.out.println(Arrays.toString(arr));
                return new int[]{i, complementIndex};
            }
            // the map doesn't have the complement, so add it
            complementMap.put(target-nums[i], i);
            System.out.println(complementMap);
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {2,7,11,15};
        s.twoSum(arr, 9);
    }
}