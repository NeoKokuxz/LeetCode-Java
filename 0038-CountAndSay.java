class Solution {
    public String countAndSay(int n) {
            String say = "1";

            for(int i = 1; i < n; i ++){
                StringBuilder sb = new StringBuilder();

                //Start character
                char start = say.charAt(0);
                int count = 0;
                for(int j = 0; j < say.length(); j++){

                    //Check current character
                    char c = say.charAt(j);

                    //If current = start means we need to count
                    if(c == start){
                        count ++;
                    }
                    //Different means we need to start a new count
                    else {
                        //Once start a new character,
                        // reset count to 1
                        // reset the start point to new character
                        sb.append(count).append(start);
                        count = 1;
                        start = say.charAt(j);
                    }

                }
                
                //Add the last part of the count and start point to substring
                sb.append(count).append(start);
                say = sb.toString();
            }
            return say;
    }
}
