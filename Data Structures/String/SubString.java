public class SubString {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println(subString(str, 0, 5));
    }

    public static String subString(String str, int st, int en) {
        String subStr = "";
        for (int i = st; i < en; i++) {
            subStr += str.charAt(i);
        }
        return subStr;
    }
}