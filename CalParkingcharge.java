import java.util.*;

public class CalParkingcharge {
    public static int calcharge(int hours) {
        int cost = 0;

        if (hours <= 2) {
            cost = hours * 100;
        }

        else if (hours <= 5) {
            cost = (2 * 100) + (hours - 2) * 50;
        }

        else {
            cost = (2 * 100) + (3 * 50) + (hours - 5) * 20;
        }
        return cost;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int hours = sc.nextInt();
        System.out.println(calcharge(hours));
    }

}
