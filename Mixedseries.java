import java.util.Scanner;

public class Mixedseries {
    public static int findNthterm(int n) {
        if (n % 2 != 0) {
            int power = (n - 1) / 2;
            return (int) Math.pow(2, power);
        } else {
            int power = (n - 2) / 2;
            return (int) Math.pow(3, power);
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(findNthterm(n));
    }
}
