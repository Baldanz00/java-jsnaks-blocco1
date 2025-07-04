import java.util.Scanner;

public class Snack2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci la prima parola");
        String parolaUno = scan.nextLine();
        System.out.println("Inserisci la seconda parola");
        String parolaDue = scan.nextLine();
        if (parolaUno.length()>parolaDue.length()) {
            System.out.println(parolaUno + " " + parolaDue);
        } else {
            System.out.println(parolaDue + " " + parolaUno);
        }
    }
}