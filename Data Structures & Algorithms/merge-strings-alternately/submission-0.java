class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();

        int l1 = word1.length();
        int p1 = 0;
        int l2 = word2.length();
        int p2 = 0;
        while(p1 < l1 && p2 < l2){
            sb.append(word1.charAt(p1));
            sb.append(word2.charAt(p2));
            p1++;
            p2++;
        }

        while (p1 < l1){
            sb.append(word1.charAt(p1));
            p1++;
        }

        while (p2 < l2){
            sb.append(word2.charAt(p2));
            p2++;
        }

        return sb.toString();
    }
}