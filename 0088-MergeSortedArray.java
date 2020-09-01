class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1.length == (m+n)){
            int x = m;
            //Add everything to nums1 array
            for(int i = 0; i < nums1.length - m; i++){
                nums1[x] = nums2[i];
                x++;
            }
            //Perform sort
            Arrays.sort(nums1);
        }
    }
}
