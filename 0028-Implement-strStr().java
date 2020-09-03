class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.isEmpty()){
            return 0;
        }
        int n = haystack.length();
        int m = needle.length();
        if(n < m){
            return -1; //Needle longer than haystack
        }
        
        //Loop through haystack - needle length, because if leftover is less than needle
        //Then needle will not be found
        
        for(int i = 0; i <= n - m; i++){
            //Keep reference to J
            int j;
            //Loop through needle and compare haystack value with needle value 
            //J is how long is the same character in haystack and needle
            for(j = 0; j < m; j++){
                if(haystack.charAt(i+j) != needle.charAt(j)){
                    break;
                }
            }
            //If the length of J is same as needle length
            if(j==m){
                //Found the needle
                return i;
            }
        }
        return -1;
    }
}
