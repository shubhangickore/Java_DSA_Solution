import java.util.Arrays;
import java.util.Scanner;

public class CountWays {

    static long[][] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Total soldiers
        int r = sc.nextInt(); // Types (1 to r)
        int start = sc.nextInt(); // First soldier (FIXED)
        int end = sc.nextInt(); // Last soldier (TARGET)

        dp = new long[n + 1][r + 1];
        for (long[] row : dp) {
            Arrays.fill(row, -1);
        }

        System.out.println(countWays(1, start, n, r, end));
    }

    static long countWays(int pos, int last, int n, int r, int end) {

        // Base case: last position
        if (pos == n) {
            return last == end ? 1 : 0;
        }

        // Memoization check
        if (dp[pos][last] != -1) {
            return dp[pos][last];
        }

        long total = 0;

        // Try all soldier types
        for (int i = 1; i <= r; i++) {
            if (i != last) { // no adjacent same
                total += countWays(pos + 1, i, n, r, end);
            }
        }

        return dp[pos][last] = total;
    }
}