import java.util.*;

public class LC_191_No {

    public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        return count;

    }

    public static void main(String args[]) {
        int n = 11;

        int res = hammingWeight(n);
        System.out.println("Number of 1 bits" + res);
    }
}