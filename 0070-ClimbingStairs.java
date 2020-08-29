class Solution {
    public int climbStairs(int n) {
        int[] way = new int[n + 1];
        //Ways to solve this
        //Way 0 = 1, just don't solve
        way[0] = 1;
        way[1] = 1; // 1 Step

        //0 and 1 already solved
        for(int i = 2; i <= n; i++){
            way[i] = way[i - 1] + way[i - 2];
        }

        return way[n];
    }
}
