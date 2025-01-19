Recursion -> Memoization -> Tabulation -> Space Optimization




Memoization (recursion) = Top-down = main problem -> base case

Steps:
1. create dp[n+1] array initialized to -1
2. if(dp[n] != -1) -> return dp[n] // value is already computed
3. else -> use recursive relation to compute dp[n] -> at the end, store the result





Tabulation = Bottom-up = base case -> main problem

Steps:
1. declare dp[n+1] array
2. initialize the base case -> dp[0] and/or dp[1]
3. traverse array -> every index -> dp[i] = dp[i-1] + dp[i-2]





Space Optimization

Steps:
1. If additional space is not required, use variables
    dp[i-1] -> prev1
    dp[i-2] -> prev2