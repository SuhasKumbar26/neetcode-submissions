class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        int lpt = 0, rpt = numbers.length - 1;

        while(lpt < rpt){
            int sum = numbers[lpt] + numbers[rpt];
            if(sum  == target){
                return new int[]{lpt+1, rpt+1};
            } else if(sum < target){
                lpt++;
            } else{
                rpt--;
            }
        }
        return ans;
    }
}
