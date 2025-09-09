public class ArrayAsArgument {
    public static void main(String[] args) {
        int marks[] = { 100, 90, 80 };
        update(marks);
        System.out.println(marks);

        // print the array
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }

    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }
}