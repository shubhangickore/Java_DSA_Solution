import java.util.*;

public class Thief {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int inc = 0;
        int exc = 0;

        for (int x : arr) {
            int nextExc = Math.max(inc, exc);
            inc = exc + x;
            exc = nextExc;
        }

        System.out.println(Math.max(inc, exc));

    }
}