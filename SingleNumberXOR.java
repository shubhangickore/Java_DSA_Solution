public class SingleNumberXOR {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 4, 1 };
        int xor = 0;

        for (int num : nums) {
            xor ^= num;
        }

        System.out.println("Single number: " + xor);
    }
}
