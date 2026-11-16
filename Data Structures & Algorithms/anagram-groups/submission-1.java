class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String str: strs){
            int[] count = new int[26];

            for(char c: str.toCharArray()){
                count[c-'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for(int i: count){
                sb.append("*");
                sb.append(i);
            }

            String key = sb.toString();
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }

        return new ArrayList(map.values());
    }
}
