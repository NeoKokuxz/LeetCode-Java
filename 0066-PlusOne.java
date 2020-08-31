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
