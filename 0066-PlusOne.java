//100%
class Solution {
    public int[] plusOne(int[] digits) {
        
        //Current last digit + 1
        int temp = digits[digits.length-1]+1;
        //flag when temp is 9 + 1 
		boolean flag = temp==10;
        
        // 10 Flag, >10 No Flag
		if(!flag){
            // >10 No Flag
			digits[digits.length-1]+=1;
			return digits;
		}
        
        //Carry 1 forward if flagged
		for(int i=digits.length-1;i>=0 && flag;i--){
			if(digits[i]+1<10){
				digits[i]+=1;
				flag=false;
			}else{
				digits[i]=0;
			}
		}
        
        //if first position 0 is 0 after all the calculation; 
        //means we need to carry it forward to new array;
		if(digits[0]==0){
			digits = new int[digits.length+1];
			digits[0] = 1;
		}
        return digits;
        
    }
}

//17%
class Solution {
    public int[] plusOne(int[] digits) {

            // initial set curry to 1
            int carry = 1;
            //Going backward
            for (int i = digits.length - 1; i >= 0; i--) {
                //Check current num + 1
                int tmp = digits[i] + carry;
                //If current num >= 10
                if (tmp >= 10) {
                    //carry the 1 to the new array down bottom
                    carry = 1;
                    //set current to % 10 = 0
                    digits[i] = tmp % 10;
                } else {
                    //No carry just add the 1 to current
                    carry = 0;
                    digits[i] = tmp;
                }
            }
            // if we have input like [9,9,9] then we will have curry = 1
            // so in this case we have an or of length len(digits) + 1
            // first digits is 1 and rest copy from digits to newDigits array
            if (carry != 0) {
                int[] newDigits = new int[digits.length+1];
                newDigits[0] = 1;
                for (int i = 1; i < newDigits.length; i++) {
                    newDigits[i] = digits[i-1];
                }
                return newDigits;
            }
            return digits;
    }
}
