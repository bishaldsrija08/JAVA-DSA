public class menuRestro {
    public static void main(String[] args) {
        String menu[] = { "Piza", "Burger", "Pasta", "Noodles", "Sandwich", "Fries", "Coke" };
        String item = "Coke";
        String result = menu(menu, item);
        if (result != null) {
            System.out.println("Item is available: " + result);
        } else {
            System.out.println("Item is not available");
        }
    }

    public static String menu(String menu[], String item) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i] == item) {
                return item;
            }
        }
        return null;
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)