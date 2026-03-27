import java.util.*;

public class MinSwapstoConvert {
    public static int MinSwapstoConvert(int[] A, int[] B) {

        int n = A.length;
        int swaps = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++)
            map.put(A[i], i);

        for (int i = 0; i < n; i++) {
            if (A[i] == B[i])
                continue;

            int correctidx = map.get(B[i]);

            int temp = A[i];
            A[i] = A[correctidx];
            A[correctidx] = temp;

            map.put(temp, correctidx);
            map.put(B[i], i);

            swaps++;
        }

        return swaps;
    }

    public static void main(String args[]) {
        int A[] = { 10, 20, 50, 40 };
        int B[] = { 50, 20, 40, 10 };
        System.out.println(MinSwapstoConvert(A, B));
    }

}