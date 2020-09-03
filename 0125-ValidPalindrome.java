class Solution {
    public boolean isPalindrome(String s) {
        // i at start index of s
        int i = 0;
        // j at last index of s
        int j = s.length() - 1;
        
        //If i and j haven't meet in middle, keep looping
        while (i < j){
            //If i point to anything else than alphanumeric characters, increase i
            while( i < j && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            
            //If j point to anything else than alphanumeric characters, decrease j
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            
            //Compare current I and J to lower case and set i++ and j-- after compare
            if( i < j && Character.toLowerCase(s.charAt(i++)) != Character.toLowerCase(s.charAt(j--))){
                return false;
            }
            

        }
        return true;
    }
}
