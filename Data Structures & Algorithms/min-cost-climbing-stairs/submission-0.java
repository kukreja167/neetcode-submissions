class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return Math.min(solve(dp,cost,0),solve(dp,cost,1));

        
    }
    public int solve(int[] dp,int[] c,int i){
        if(i>=c.length){
            return 0;
        }
        if(dp[i] != -1) return dp[i];
        dp[i]=c[i] + Math.min(solve(dp,c,i+1),solve(dp,c,i+2));
        return dp[i];
    }
}
