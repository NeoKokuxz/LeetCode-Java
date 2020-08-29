class Solution {
    public int maxSubArray(int[] nums) {
            int[] table = new int[nums.length];
            int max = nums[0]; //Set initial Max
            table[0] = nums[0]; //Set initial table to start

            for(int i = 1; i < nums.length; i++){
                //If num[i] greater than current+previous then num[i] is the new sub-array start
                table[i] = Math.max(nums[i], nums[i] + table[i - 1]); 
                max = Math.max(max, table[i]); //Keep update max til the end
            }
            
            return max;
    }
}
