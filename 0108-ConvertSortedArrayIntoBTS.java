class Solution {
        public TreeNode sortedArrayToBST(int[] nums) {
            //Nothing in array, return null
            if(nums.length == 0) {
                return null;
            }

            return constructArrayToBTS(nums, 0, nums.length - 1);
        }

        //Parameter: Array, Start, End
        public TreeNode constructArrayToBTS(int[] array, int start, int end){
            //Left boundary shouldn't be greater than right boundary
            if(start > end){
                return null;
            }
            //Set midpoint - Root Node 
            int midPoint = start + (end - start) / 2;
            //Set up root node by using mid point in array
            TreeNode node = new TreeNode(array[midPoint]);
            //Set up left and right from root node
            node.left = constructArrayToBTS(array, start, midPoint - 1);
            node.right = constructArrayToBTS(array, midPoint + 1, end);
            
            return node;
        }
}
