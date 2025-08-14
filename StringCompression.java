public class StringCompression {
    public static int compress(char[] chars) {
        int index = 0; // position to insert compressed char
        int i = 0;     // pointer to traverse array

        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;

            while (i < chars.length && chars[i] == currentChar) {
                i++;
                count++;
            }

            chars[index++] = currentChar;

            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[index++] = c;
                }
            }
        }

        return index;
    }

    public static void main(String[] args) {
        char[] chars = { 'a', 'a', 'b', 'b', 'c', 'c', 'c' };
        int newLength = compress(chars);

        System.out.print("Compressed array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(chars[i]);
        }
    }
}
