class Solution {
    public boolean containsDuplicate(int[] nums) {
            HashMap<Integer, Integer> duplicateMap = new HashMap<>();
        
            for(int i : nums){
                if(!duplicateMap.containsKey(i)){
                    duplicateMap.put(i, 1);
                } else {
                    return true;
                }
            }
            return false;
    }
}
