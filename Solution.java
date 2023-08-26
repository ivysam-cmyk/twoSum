class Solution {
    public int[] twoSum(int[] nums, int target) {
        //there are 2 nums to use inside the array.
        //take 1st element and use the next elements and sum until you get the answer
        int[] twoNums = new int[2];
        for(int i =0; i<nums.length-1; i++){
            int reqVal = target - nums[i];
            System.out.println("reqVal: "+reqVal);
            for (int j=i+1;j>i && j<nums.length; j++) {
                System.out.println("i: " + i + " j: " + j);
                if (nums[j]==reqVal){
                    twoNums[0] = i;
                    twoNums[1] = j;
                    return twoNums;
                }
            }
        }
        return twoNums;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {3,2,4};
        s.twoSum(arr, 6);
    }
}
