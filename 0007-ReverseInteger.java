class Solution {
    public int reverse(int x) {
        boolean negative = false;
        int nums = x;
        //if negative then true and * -1
        if(nums < 0){
            negative = true;
            nums *= -1;
        }

        //initial reversed integer
        long reversed = 0;
        // Each loop gets the last digit of nums
        // reversed * 10 just to leave spot for single digit to come in
        // Example:
        // OG: 436 Take last digit 6 and keep looping
        // 6 -> 60 + 3 -> 63 * 10 = 630 + 4 = 634
        while (nums > 0){
            reversed = (reversed * 10) + (nums % 10); 
            nums /= 10; //Each time take out last digit of nums
        }

        //If our value greater than max value, return 0
        if(reversed > Integer.MAX_VALUE) {
            return 0;
        }

        //if it was negative number => true, flip back the - sign
        if (negative == true) {
            return (int) (-1 * reversed);
        } else {
            return (int) reversed;
        }
    }
}
