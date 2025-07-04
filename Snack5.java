import java.util.Scanner;

public class Snack5 {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    for (int i=1; i<=6; i++) {
        System.out.print("Inserisci il numero " + i + ":");
        int num= scan.nextInt();
        if (num % 2 != 0) {
            System.out.print(num + " è dispari.");
            
        } else {
            System.out.print(num + " è pari.");
        }
    }
}
}
