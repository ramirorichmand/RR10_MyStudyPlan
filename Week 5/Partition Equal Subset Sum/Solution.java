class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int n : nums){
            sum += n;
        }
        if(sum%2 != 0) //if sum is odd we cannot partition it into two parts
            return false;
        return isSubsetSum(nums,sum/2,nums.length);
// sum/2 because if we can find a subarray for sum/2 then definitely there will be another subarray for remaining sum/2  
    }
    //below method is applicable for subset sum same can be used for that problem(0/1 knapsack)
    private boolean isSubsetSum(int[] nums,int sum,int n){
        boolean[][] dp = new boolean[n+1][sum+1];//+1 as we're starting from 0 and till sum & n
    for (int i = 0; i < dp.length; i++) {
        Arrays.fill(dp[i], false);
    }
    dp[0][0] = true;
    for (int i = 1; i < n+1; i++) {
        dp[i][0] = true;
    }
    for (int j = 1; j < sum+1; j++) {
        dp[0][j] = false;
    }
    for (int i = 1; i < n+1; i++) {
        for (int j = 1; j < sum+1; j++) {
            dp[i][j] = dp[i-1][j];
            if (j >= nums[i-1]) {
                dp[i][j] = (dp[i][j] || dp[i-1][j-nums[i-1]]);
            }
        }
    }
   
    return dp[n][sum];
    }
}