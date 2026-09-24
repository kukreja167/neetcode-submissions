class Solution {
    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return solve(dp,nums,0);
        
    }
    public int solve(int[] dp,int[] nums,int i){
        if(i>=nums.length) return 0;
        if(dp[i] !=-1) return dp[i];
        // int include=solve(dp,nums,i++)
        dp[i]=Math.max(  nums[i] + (solve(dp,nums,i+2)), solve(dp,nums,i+1));
        return dp[i];
    }
}
