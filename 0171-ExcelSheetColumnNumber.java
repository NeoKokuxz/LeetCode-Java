class Solution {
    public int titleToNumber(String s) {
        int result = 0;
        for(char c : s.toCharArray()){
            //C - 'A' turns from ascii to A = 1, B = 2
            int i = c - 'A' + 1;
            // Example:
            // AA
            // First A:
            // A - A + 1 = 1 - 1 + 1 = 1
            // result = 0*26 + 1 = 1
            // Second A:
            // A - A + 1 = 1
            // Each Loop with increase result and that will be * 26
            // result = result(1) * 26 + 1 = 27
            // So 27 = AA
            result = result*26 + i;
        }
        return result;
    }
}
