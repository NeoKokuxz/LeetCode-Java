class Solution {
    public boolean isValid(String s) {
            if(s.length() % 2 != 0) return false;

            //Create stack and only push open ( [ {  to stack
            //If there's a closing one, then pop it off the stack top
            //If the one pop off is not the right one, return false
            Stack<Character> stack = new Stack<>();
            for (char c : s.toCharArray()){
                if(c == '(' || c == '{' || c == '['){
                    stack.push(c);
                } else if(c == ')' && !stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                } else if(c == ']' && !stack.isEmpty() && stack.peek() == '['){
                    stack.pop();
                } else if(c == '}' && !stack.isEmpty() && stack.peek() == '{'){
                    stack.pop();
                } else {
                    return false;
                }
            }


            return stack.isEmpty();
    }
}
