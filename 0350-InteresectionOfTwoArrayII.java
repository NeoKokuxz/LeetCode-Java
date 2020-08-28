class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int pointer1 = 0, pointer2 = 0;

        //Increase the pointer position to compare the current value
        while(pointer1 < nums1.length && pointer2 < nums2.length){
            if(nums1[pointer1] == nums2[pointer2]){
                arrayList.add(nums1[pointer1]);
                pointer1++;
                pointer2++;
            } else if(nums1[pointer1] < nums2[pointer2]) {
                pointer1++;
            } else {
                pointer2++;
            }
        }

        //Put everything from list back to array and return
        int[] result = new int[arrayList.size()];
        for(int i = 0; i < arrayList.size(); i++){
            result[i] = arrayList.get(i);
        }
        
        return result;
    }
}
