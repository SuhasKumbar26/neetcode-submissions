class Solution {
    public int[] sortArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i: nums){
            max = Math.max(i, max);
            min = Math.min(i, min);
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        int j = 0;
        for(int i = min; i <= max; i++){
            if(map.containsKey(i)){
                int times = map.get(i);
                while(times-- > 0){
                    nums[j] = i;
                    j++;
                }
            }
        }
        return nums;
    }
}