public class SingleNumber {

    public static int singleNumber(int[] nums){
        Map<Integer, Integer> numberMap = new HashMap<>();

        for(int i : nums){
            if(!numberMap.containsKey(i)){
                numberMap.put(i, 1);
            } else {
                numberMap.remove(i);
            }
        }
        for(Map.Entry<Integer,Integer> map: numberMap.entrySet()){
            return map.getKey();
        }
        return 0;
    }
}
