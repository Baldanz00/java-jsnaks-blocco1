public class Snack10 {
    public static void main(String[] args) {
        int righe = 5;

        for (int i = 0; i < righe; i++) {
            for (int j = 0; j < righe - i - 1; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
