class Solution {
    public int majorityElement(int[] nums) {
        int majEle = nums[0];
        int count = 0;

        for(int i: nums){
            if(i == majEle){
                count++;
            } else{
                if(count > 0){
                    count--;
                } else{
                    count = 1;
                    majEle = i;
                }
            }
        }
        return majEle;
    }
}