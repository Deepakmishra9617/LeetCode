class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum= n*(n+1)/2;
        int asum =0;
        int ans =0;
        for (int i=0;i<n;i++){
            asum +=nums[i];
             ans = sum-asum;
        }
        return ans;
    }
}