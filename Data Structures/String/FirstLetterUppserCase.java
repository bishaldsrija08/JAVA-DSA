public class FirstLetterUppserCase {
    public static void main(String[] args) {
        String str = "hello world! welcome to java programming.";
        System.out.println(capitalString(str));
    }

    public static String capitalString(String str) {
        StringBuilder sb = new StringBuilder();
        // Convert the first character to uppercase
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            // Check for space and convert the next character to uppercase
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                // Increment i to skip the space and capitalize the next character
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}

// TC: O(n)
// SC: O(n)