import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            System.out.println(i);
            hashMap.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++){
            int result = target - nums[i];
            System.out.println(result);
            if(hashMap.containsKey(result) && hashMap.get(result) != i){
                return new int[] {i, hashMap.get(result)};
            }
        }
        throw new IllegalArgumentException("Not found");
    }
}
