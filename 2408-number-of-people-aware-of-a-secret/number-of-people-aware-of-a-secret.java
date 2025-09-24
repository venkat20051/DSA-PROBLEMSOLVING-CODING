class Solution {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        int MOD = 1_000_000_007;
        long[] dp = new long[n + 1];
        dp[1] = 1;  // Day 1, one person learns the secret

        long res = 0;
        for (int day = 1; day <= n; day++) {
            long share = dp[day];
            if (share == 0) continue;

            // This person starts sharing after "delay" days,
            // and stops before they "forget".
            for (int next = day + delay; next < day + forget && next <= n; next++) {
                dp[next] = (dp[next] + share) % MOD;
            }
        }

        // Count all people who still know the secret at day n
        for (int day = n - forget + 1; day <= n; day++) {
            if (day >= 1) res = (res + dp[day]) % MOD;
        }

        return (int) res;
    }
}
