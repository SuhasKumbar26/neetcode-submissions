class Solution {
    public int maxArea(int[] h) {
        int l = 0, r = h.length - 1, maxArea = 0;
        while(l < r){
            int min = Math.min(h[l], h[r]);
            int area = (r - l) * min;
            maxArea = Math.max(maxArea, area);
            if(h[l] >= h[r]){
                r--;
            } else{
                l++;
            }
        }

        return maxArea;
    }
}
