//25% Faster
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


//100% Faster
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        
        //For example:
        // 0 1 2 3 - Length 4 and sum= 6
        //Fomula: 4 * 5 / 2 = 10 - 6 = 4, missing 4 -> Correct
        int sum = ((n) * (n+1))/2;
        for(int i : nums)
        {
            sum -= i;
        }
        
        return sum;
    }
}
