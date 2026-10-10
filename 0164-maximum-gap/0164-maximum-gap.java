import java.util.Arrays;
class Solution {
    public int maximumGap(int[] nums) {
        int currentgap=0;
        Arrays.sort(nums);
        int maxgap = 0;
        for(int i = 1; i < nums.length; i++){
            currentgap = nums[i] - nums[i-1];
            if (currentgap > maxgap) {
                maxgap = currentgap;
            }
        }
        return maxgap;
    }
}