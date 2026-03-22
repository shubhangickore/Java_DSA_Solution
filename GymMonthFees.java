import java.util.*;

public class GymMonthFees {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 3 != 0) {
            System.out.println("Error");
        } else {
            System.out.println((n / 6) * 7000 + (n % 6 == 3 ? 5000 : 0));
        }
    }
}