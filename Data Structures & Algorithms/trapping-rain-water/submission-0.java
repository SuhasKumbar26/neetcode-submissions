class Solution {
    public int trap(int[] ht) {
        int lmax = 0, rmax = 0, l = 0, r = ht.length - 1, ans = 0;

        while(l < r){
            lmax = Math.max(lmax, ht[l]);
            rmax = Math.max(rmax, ht[r]);

            if(lmax <= rmax){
                ans += lmax - ht[l];
                l++;
            } else{
                ans += rmax - ht[r];
                r--;
            }
        }

        return ans;
    }
}
