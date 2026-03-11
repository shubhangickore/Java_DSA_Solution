import java.util.Scanner;

public class Q2 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int goal = sc.nextInt();
        int n = start ^ goal;
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }

        System.out.println(count);

    }
}
