import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] twoNums = new int[2];
        for(int i =0; i<nums.length-1; i++){
            int reqVal = target - nums[i];
            System.out.println("reqVal: "+reqVal);
            List<Integer> numsList =  Arrays.stream(nums).boxed().collect(Collectors.toList());
            //slice
            numsList = numsList.subList(i+1,nums.length);
            // System.out.println("numsList: "+numsList);
            int reqIndex;
            //if the reqVal isn't in numsList skip this value of i
            if(numsList.indexOf(reqVal) == -1){
                continue;
            } else{
                // i+1 accounts for the slicing above
                reqIndex = numsList.indexOf(reqVal) +(i+1);
            }
            System.out.println("i: "+i);
            System.out.println("reqIndex: "+reqIndex);
            twoNums[0] = i;
            twoNums[1] = reqIndex;
            return twoNums;
        }
        return twoNums;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {3,2,4};
        s.twoSum(arr, 6);
    }
}
