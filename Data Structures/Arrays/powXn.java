public class powXn {
    public static void main(String[] args) {
        int coff = -1;
        int power = 10;
        if (power < 0) {
            coff = 1 / coff;
            power = -power;
        }

        if (power == 0) {
            System.out.println(1);
            return;
        }
        if (coff == 0) {
            System.out.println(0);
            return;
        }
        if (coff == 1) {
            System.out.println(1);
            return;
        }
        if (coff == -1 && power % 2 == 0) {
            System.out.println(1);
            return;
        }
        if (coff == -1 && power % 2 == 1) {
            System.out.println(-1);
            return;
        }
        int result = 1;
        while (power > 0) {
            if (power % 2 == 1) {
                result *= coff;
            }
            coff *= coff;
            power /= 2;
        }
        System.out.println(result);
    }
}