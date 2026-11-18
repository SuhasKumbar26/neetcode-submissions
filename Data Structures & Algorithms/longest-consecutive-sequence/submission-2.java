class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i: nums){
            set.add(i);
        }
        int ans = 1;

        for(int i : set){
            if(!set.contains(i-1)){
                int count = 1;
                int cur = i;
                while(set.contains(cur+1)){
                    cur += 1;
                    count++;
                }
                ans = Math.max(ans, count);
            }
        }
        return ans;
    }
}