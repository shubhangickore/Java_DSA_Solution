import java.util.*;

public class SubstringCount {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int result = 0;
        int count = 0;

        for (char ch : str.toCharArray()) {
            if (ch == '1') {
                count++;
            } else {
                result += count * (count + 1) / 2;
                count = 0;
            }

        }

        result += count * (count + 1) / 2;
        System.out.print(result);
    }

}
