class Solution {
    public boolean isAnagram(String s, String t) {
            if(s.length() != t.length()){
                return false;
            }
//            ****HashMap Approach****
//             HashMap<Character, Integer> MapS = new HashMap<>();
//             HashMap<Character, Integer> MapT = new HashMap<>();

//             for(int i = 0; i < s.length(); i++){
//                 char sc = s.charAt(i);
//                 char tc = t.charAt(i);
//                 MapS.put(sc, MapS.getOrDefault(sc,0)+1);
//                 MapT.put(tc, MapT.getOrDefault(tc,0)+1);
//             }

//             return MapS.equals(MapT);
        
            //Faster Approach using Array sort
            char[] str1 = s.toCharArray();
            char[] str2 = t.toCharArray();
            Arrays.sort(str1);
            Arrays.sort(str2);
            return Arrays.equals(str1, str2);
    }
}
