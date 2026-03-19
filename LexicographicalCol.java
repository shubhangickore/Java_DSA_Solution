import java.util.*;

public class LexicographicalCol {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String[] strgs = new String[n];
        for (int i = 0; i < n; i++) {
            strgs[i] = sc.next();
        }
        int col = strgs[0].length();
        int count = 0;

        for (int i = 0; i < col; i++) {
            for (int j = 1; j < n; j++) {
                if (strgs[j].charAt(i) < strgs[j - 1].charAt(i)) {
                    count++;
                    break;
                }
            }
        }
        System.out.print(count);
    }

}
