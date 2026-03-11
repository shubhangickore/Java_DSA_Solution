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

   
