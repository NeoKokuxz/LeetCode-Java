class Solution {
    public int rob(int[] nums) {
            //No House to rob
            if(nums == null || nums.length == 0){
                return 0;
            }

            //Only one house to rob
            if (nums.length == 1){
                return nums[0];
            }

            //Only two houses to rob
            if(nums.length == 2){
                return Math.max(nums[0], nums[1]);
            }

            //Set up the house array to rob
            int[] houseToRob = new int[nums.length];
            //House to rob 0 is 0 and 1 and max between 0 and 1
            houseToRob[0] = nums[0];
            houseToRob[1] = Math.max(nums[0], nums[1]);
        
            // houseToRob array store the best houses to rob in the array
            for(int i = 2; i < houseToRob.length; i++){
                houseToRob[i] = Math.max(nums[i] + houseToRob[i-2], houseToRob[i-1]);
            }

            //Return the last position then we gonna get the max cash
            return houseToRob[nums.length - 1];
    }
}
