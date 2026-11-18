class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int count1 = 0, maj1 = Integer.MAX_VALUE;
        int count2 = 0, maj2 = Integer.MAX_VALUE;
        for(int i: nums){
            if(i == maj1) count1++;
            else if (i == maj2) count2++;
            else if(count1 == 0){
                maj1 = i;
                count1 = 1;
            } else if(count2 == 0){
                maj2 = i;
                count2 = 1;
            } else{
                count1--;
                count2--;
            }
        }

        int f1 = 0, f2 = 0;

        for(int i: nums){
            if(i == maj1) f1++;
            else if (i == maj2) f2++;
        }

        if(f1 > (nums.length/3)) ans.add(maj1);
        if(f2 > (nums.length/3)) ans.add(maj2);

        return ans;
    }
}