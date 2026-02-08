

// Problem: LC2787
// Description: Given two integers n and x, return the number of ways to express n as the sum of the x-th power of unique positive integers. 
// Since the answer can be very large, return it modulo 10^9 + 7.
// Link : https://leetcode.com/problems/ways-to-express-an-integer-as-sum-of-powers/description/




//  LC2787.java


class LC2787 {
    private static final int MOD = 1_000_000_007;
    public int numberOfWays(int n, int x) {
        long[] dp = new long[n + 1];
        dp[0] = 1; 
        for (int i = 1; Math.pow(i, x) <= n; i++) {
            int power = (int) Math.pow(i, x);
            for (int sum = n; sum >= power; sum--) {
            dp[sum] = (dp[sum] + dp[sum - power]) % MOD;
            }
        } return (int) dp[n];
    }
}