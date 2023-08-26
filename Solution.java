import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] twoNums = new int[2];
        //create hashmap
        //key is complement and value is the index
        HashMap<Integer,Integer> complementMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            //populate hashmap by going through the nums arr
            complementMap.put(target- nums[i], i);
        }
        //once map is filled up go through the nums arr again and check the if the key is present in the other indexes
        //to do this: for each value(index) in the map, check all the other indexes in the nums arr whether it == key
        for (int i = 0; i < nums.length; i++) {

        }
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {3,2,4};
        s.twoSum(arr, 6);
    }
}