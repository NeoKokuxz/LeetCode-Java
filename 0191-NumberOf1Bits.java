public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
            int result = 0;
            while(n!=0){
                result += (n%2) & 1;
                
                //Right shift with LSB bit 0 for both -ve and +ve number
                n >>>= 1;
            }
            return result;
    }
}

/*
LSB - left most bit
Diff between >> and >>> (Right shift with Zeros)
  >> fills LSB bit 0 for +ve numbers and 1 for -ve numbers
  >>> fills LSB bit 0 for both -ve and +ve numbers

*/
