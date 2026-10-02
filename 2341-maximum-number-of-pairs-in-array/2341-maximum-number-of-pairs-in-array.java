class Solution {
    public int[] numberOfPairs(int[] nums) {
        int[] count = new int[101];
        for (int x : nums) {
            count[x]++;
        }
        int pairs = 0;
        for (int c : count) {
            pairs += c / 2;
        }
        int leftover = nums.length - 2 * pairs;
        return new int[]{pairs, leftover};
    }
}