class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int l = 0, r = nums.length-1;

        rotate(nums, l, r);
        rotate(nums, l, k-1);
        rotate(nums, k, r);
    }

    private void rotate(int[] nums, int l, int r){
        while(l<r){
            int t = nums[l];
            nums[l] = nums[r];
            nums[r] = t;
            l++;
            r--;
        }
    }
}