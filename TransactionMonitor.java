import java.util.*;

public class TransactionMonitor {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<String> seen = new HashSet<>();
        int prevTime = -1;

        for (int i = 0; i < n; i++) {
            String sender = sc.next();
            String receiver = sc.next();
            int timestamp = sc.nextInt();
            int transaction = sc.nextInt();

            String key = sender + "-" + receiver + "-" + timestamp;

            if (seen.contains(key)) {
                System.out.print("Error: Duplicate value");
                return;
            }
            seen.add(key);

            if (prevTime != -1 && (timestamp - prevTime > 60)) {
                System.out.print("Error: Fraud detection");
                return;
            }
            prevTime = timestamp;
        }

        System.out.println("All Transactions are valid");
    }

}
