public class Snack11 {
    public static void main(String[] args) {
        int righe = 5;

        for (int i = 0; i < righe - 1; i++) {
            for (int j = 0; j < righe - i - 1; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < (2 * i + 1); k++) {
                if (k == 0 || k == 2 * i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        // Ultima riga di asterischi
        for (int i = 0; i < (2 * righe - 1); i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
