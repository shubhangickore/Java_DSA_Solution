public class Palindrome {
    public static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return false;
    }

    public static void main(String[] args) {
        String text = "Madam";
        System.out.println("Is palindrome: " + isPalindrome(text));
    }
}
