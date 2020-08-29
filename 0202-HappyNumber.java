class Solution {
    public boolean isHappy(int n) {
        if(n == 1){
            return true;
        }
        int last, current = n;
        int sum = 0;

        //This loop will finish current number
        while (current > 0){
            //Get the last digit of N
            last = current % 10; 
            sum += last * last;
            
            //Get remaining number of N
            //current at this point will eventually end up 0 to finish current happy number
            current = current / 10;
        }
        
        //if the happy from the previous result is 1 then it's happy
        if (sum == 1) {
            return true; // It is happy
        } else if (sum == 4){
            return false;
        }
        
        // 19 will turn into 1^2 + 9^2 = 82, and 82 will be pass into recursive
        return isHappy(sum);
    }
}
