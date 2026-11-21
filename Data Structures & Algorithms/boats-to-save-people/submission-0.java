class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int cnt = 0, l = 0, r = people.length - 1;
        while (l <= r) {
            if (people[l] + people[r] <= limit) {
                l++;
                r--;
                cnt++;
            } else if (people[l] < people[r]) {
                r--;
                cnt++;
            } else {
                l++;
                cnt++;
            }
        }
        return cnt;
    }
}