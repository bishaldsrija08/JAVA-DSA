public class ShortestPath {
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        int x = 0, y = 0;
        int n = str.length();

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == 'N') {
                y++;
            } else if (ch == 'S') {
                y--;
            } else if (ch == 'E') {
                x++;
            } else if (ch == 'W') {
                x--;
            }
        }
        x *= x;
        y *= y;
        double ShortestPath = Math.sqrt(x + y);
        System.out.println("Shortest Path: " + ShortestPath);
    }
}