class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        int lastSmall = Integer.MIN_VALUE;
        int count = 0;
        int ans = 1;

        Arrays.sort(nums);

        for(int i : nums){
            if(i-1 == lastSmall){
                count++;
                lastSmall = i;
            } else if(i != lastSmall){
                lastSmall = i;
                count = 1;
            }

            ans = Math.max(count, ans);
        }
        return ans;
    }
}
