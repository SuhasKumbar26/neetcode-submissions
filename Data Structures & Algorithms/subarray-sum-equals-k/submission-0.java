class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int count = 0;
        int pSum = 0;

        for (int i : nums) {
            pSum += i;

            if (map.containsKey(pSum - k)) {
                count += map.get(pSum - k);
            }

            map.put(pSum, map.getOrDefault(pSum, 0)+1);
        }

        return count;
    }
}