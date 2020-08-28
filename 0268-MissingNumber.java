class Solution {
    public int missingNumber(int[] nums) {
            Arrays.sort(nums);
            int count = 0;
            for(int i : nums){
                if( i != count){
                    return count;
                }
                count ++;
            }
            return nums.length;
    }
}
