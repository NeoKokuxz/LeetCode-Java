class Solution {
    public int trailingZeroes(int n) {
        //Count how many 5 in n
        int count = 0;
        
        //If n is greather or equal to 5
        while (n >= 5){
            //Add the all the 5 in n to count
            count += n/5;
            // Example: N = 25, and n/5 + count = 5 -> count
            // Now N/5 = 25/5 = 5 now
            n /= 5;
        }
        
        return count;
    }
}
