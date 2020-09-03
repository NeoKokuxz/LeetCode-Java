class Solution {
    public void rotate(int[] nums, int k) {
        // How many number to reverse
        k = k % nums.length;
        
        //Idea:
        // Reverse all number in array
        // 1 2 3 4 5 -> 5 4 3 2 1 
        // Reverse k number back
        // k = 3 - 4 5 3 2 1 
        //Reverse the rest back
        // 4 5 1 2 3 - Done
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
        
    }
    public void reverse(int[] nums, int startIndex, int endIndex){
        while(startIndex < endIndex){
            int temp = nums[startIndex];
            nums[startIndex] = nums[endIndex];
            nums[endIndex] = temp;
            startIndex ++;
            endIndex --;
        }
    }
}
