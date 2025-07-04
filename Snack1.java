import java.util.Scanner;

public class Snack1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Inserisci il primo numero.");
        int numeroUno = scan.nextInt();
        System.out.print("Inserisci il secondo numero.");
        int numeroDue = scan.nextInt();
        if (numeroUno>numeroDue) {
            System.out.print("Il primo numero è maggiore del secondo");

        } else if (numeroDue>numeroUno) {
            System.out.print("Il secondo numero è maggiore del primo");
        } else {
            System.out.print("I due numeri sono uguali");
        }
        }
    }
