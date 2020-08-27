class Solution {
    public int majorityElement(int[] nums) {
        double half = nums.length / 2;

        HashMap<Integer, Integer> numMap = new HashMap<>();
        int maxCount = 0;
        int position = 0;

        //Put everything from array into hashmap
        for(int i : nums){
            //Get current Value +1 or 0 + 1 for initial
            numMap.put(i, numMap.getOrDefault(i,0)+1);
        }

        //Check occurrence
        for(int i : nums){
            int temp = numMap.get(i); //Value of i
            if(temp > maxCount){
                position = i;
                maxCount = temp;
            }
        }

        if(maxCount > half){
            return position;
        } else {
            return -1;
        }
    }
}
