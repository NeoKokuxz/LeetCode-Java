class Solution {
    public boolean isPowerOfThree(int n) {
        //Power of 3 means 3^0 3^1 ..... 3^19
        return n > 0 && Math.pow(3,19) % n == 0;
    }
}
