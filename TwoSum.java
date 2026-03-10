import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> seenNumbers = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int neededNumber = target - nums[i];
            if (seenNumbers.containsKey(neededNumber)) {
                return new int[] { seenNumbers.get(neededNumber), i };
            }
            seenNumbers.put(nums[i], i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;

        int[] result = findTwoSum(nums, target);

        if (result.length == 2) {
            System.out.println("Indexes: " + result[0] + " and " + result[1]);
            System.out.println("Numbers: " + nums[result[0]] + " and " + nums[result[1]]);
        } else {
            System.out.println("No solution found.");
        }
    }
}
