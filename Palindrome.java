public class Palindrome {
    public static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase(); // modifies the original string stored in the variable str by first removing
                                                           all whitespace characters and then converting all remaining characters to lowercase. 
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String text = "Madam";
        System.out.println("Is palindrome: " + isPalindrome(text));
    }
}
