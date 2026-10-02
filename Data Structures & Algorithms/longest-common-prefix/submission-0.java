class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];

        for (int i = 0; i < strs.length; i++) {
            while (i < strs.length && strs[i].indexOf(prefix) == -1) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.length() == 0)
                    return "";
            }
        }

        return prefix;
    }
}