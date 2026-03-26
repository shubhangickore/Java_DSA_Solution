import java.util.*;

public class Maxproduct {
    public static int maxproductsubset(int[] arr) {

        int n = arr.length;
        if (n == 1)
            return arr[0];

        int max_neg = Integer.MIN_VALUE;
        int count_neg = 0, count_zero = 0;
        int product = 1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                count_zero++;
                continue;
            }

            if (arr[i] < 0) {
                count_neg++;
                max_neg = Math.max(max_neg, arr[i]);
            }

            product *= arr[i];
        }

        if (count_zero == n)
            return 0;

        if (count_neg == 1 && count_zero + count_neg == n) {
            return max_neg;
        }

        if (count_neg % 2 != 0) {
            product /= max_neg;
        }

        return product;
    }

    public static void main(String args[]) {
        int[] arr = { -1, 2, 3, 4 };
        System.out.println(maxproductsubset(arr));
    }
}