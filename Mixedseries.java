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

/*
 * ```
 * 
 * ---
 * 
 * ## Identify Pattern
 * | Observation | Pattern |
 * |-------------|---------|
 * | Constant difference | AP |
 * | Constant ratio | GP |
 * | Sum of previous two | Fibonacci |
 * | Two series merged | Mixed (check odd/even) |
 * 
 * ---
 * 
 * ## Formulas
 * | Pattern | Formula | Code |
 * |---------|---------|------|
 * | AP | a+(n-1)*d | `return a + (n-1) * d;` |
 * | GP | a*r^(n-1) | `return (int)(a * Math.pow(r, n-1));` |
 * | Fibonacci | prev+prevprev | use loop |
 * | Mixed | check n%2 | use if/else + Math.pow |
 * 
 * ---
 * 
 * ## Mixed Series Rule
 * ```
 * n is ODD → (n-1)/2 → Math.pow(base1, power)
 * n is EVEN → (n-2)/2 → Math.pow(base2, power)
 * ```
 * 
 * ## Exam Steps
 * ```
 * 1 → Write first 8 terms on rough paper
 * 2 → Separate odd/even positions
 * 3 → Find pattern → AP/GP/Powers
 * 4 → Write formula → Code it!
 * 
 */