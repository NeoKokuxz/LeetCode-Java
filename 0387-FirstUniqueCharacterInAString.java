class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int pointer = s.length();

        for (int i = 0; i < s.length(); i++) {
            if (!hashMap.containsKey(s.charAt(i))) {
                hashMap.put(s.charAt(i), i);
            } else {
                hashMap.put(s.charAt(i), s.length());
            }
        }
        
        for(char key : hashMap.keySet()){
            pointer = Math.min( pointer , hashMap.get(key) );
        }

        if(pointer < s.length()){
            return pointer;
        } else {
            return -1;
        }
    }
}
