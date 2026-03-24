import java.util.*;

public class CalDiscount {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        double amount = sc.nextDouble();
        if (amount < 0) {
            System.out.println("Error:invalid amount");
            return;
        }

        double discount = 0;
        if (amount < 1000) {
            discount = 0.05;
        }

        else if (amount < 2000) {
            discount = 0.10;
        }

        double finalamount = amount - (amount * discount);
        System.out.println(finalamount);

    }

}
