public class ReverseBits {
    public class Solution {
        // you need treat n as an unsigned value
        // unsigned value = 32 bit
        public int reverseBits(int n) {
            int result = 0;
            for(int i = 0; i < 32; i++){
                result <<= 1;
                if((n&1) > 0){
                    result ++;
                }
                n >>= 1;
            }
            return result;
        }
    }
}
