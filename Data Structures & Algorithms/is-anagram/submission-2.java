class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] map = new int[26];

        for(int i = 0; i < s.length(); i++){
            char sc = s.charAt(i);
            char tc = t.charAt(i);

            map[sc-97]++;
            map[tc-97]--;
        }

        for(int i: map){
            if(i != 0) return false;
        }
        return true;
    }
}
