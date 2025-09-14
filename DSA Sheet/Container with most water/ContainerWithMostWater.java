public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int maxWater = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int width = j - i;
                int myHeight = Math.min(height[i], height[j]);
                int area = width * myHeight;
                maxWater = Math.max(maxWater, area);
            }
        }
        return maxWater;
    }
}

// Brute Force Approach
// Time Complexity: O(n^2)
// Space Complexity: O(1)
