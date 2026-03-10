import java.util.Stack;
import java.util.*;

public class DailyTemperature {
    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int index = stack.pop();
                answer[index] = i - index;
            }
            stack.push(i);
        }
          return answer;
    }

    public static void main(String[] args) {
        int[] temperatures = { 73, 74, 75, 71, 69, 72, 76, 73 90};
        int[] result = dailyTemperatures(temperatures);

        System.out.print("Days to wait for warmer temp: ");
        for (int days : result) {
            System.out.print(days + " ");
        }
    }
}
