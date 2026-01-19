class Solution {
    private static final long MOD = 1_000_000_007;

    // Fast modular exponentiation (binary exponentiation)
    private long modPow(long base, long exp) {
        long result = 1;
        base %= MOD;
        while (exp > 0) {
            if ((exp & 1) == 1) { // if exp is odd
                result = (result * base) % MOD;
            }
            base = (base * base) % MOD;
            exp >>= 1; // divide exp by 2
        }
        return result;
    }

    public int countGoodNumbers(long n) {
        long evenCount = (n + 1) / 2; // ceil(n/2)
        long oddCount = n / 2;        // floor(n/2)

        long waysEven = modPow(5, evenCount); // 5 choices for even indices
        long waysOdd = modPow(4, oddCount);   // 4 choices for odd indices

        return (int)((waysEven * waysOdd) % MOD);
    }
}
