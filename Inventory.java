import java.util.*;

public class Inventory {
    public static void main(String args[]) {
        int arr[] = { 3, 5, 10, 4, 20, 30, 8 };

        ArrayList<Integer> nonMultiples = new ArrayList<>();
        ArrayList<Integer> multiples = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 10 == 0) {
                multiples.add(arr[i]);
            } else {
                nonMultiples.add(arr[i]);
            }
        }

        int index = 0;
        for (int num : nonMultiples) {
            arr[index++] = num;
        }

        for (int num : multiples) {
            arr[index++] = num;
        }

        System.out.println(Arrays.toString(arr));

    }

}




