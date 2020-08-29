class Solution {
    public int removeDuplicates(int[] nums) {
            //Initial index to store value
            //First int will always be unique, so index starts at 1 not 0
            int index = 1;
            for(int i = 0; i < nums.length - 1; i++){
                if(nums[i] != nums[i+1]){
                    //if i+1 is unique, put into our index position
                    nums[index] = nums[i + 1];
                    index++;
                }
            }
            
            return index;
    }
}
