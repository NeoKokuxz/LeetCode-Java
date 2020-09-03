class Solution {
    public int mySqrt(int x) {
        //Base case 0 or 1
        if(x <= 1) return x;
        //left and right boundary
        long left = 1, right = x;
        //Binary search
        while(left < right) {
            //Set midpoint and prevent overflow
            long mid = left + (right - left) / 2;
            //Check if mid point is greater or less than input
            if(mid * mid > x) {
                //Set right boundary, now left - mid
                right = mid;
            } else {
                //Set left boundary, now mid+1 - right
                left = mid + 1;
            }
        }
        return (int) left - 1;
    }
}
