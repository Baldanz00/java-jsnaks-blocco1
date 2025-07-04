
import java.util.Scanner;

public class Snack4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] invitati = {"Jay" , "Nick", "Daisy", "Tom", "Jordan"};
        System.out.println("Inserisci il tuo nome");
        String nomeUtente = scan.nextLine();
        boolean presente= false;
        for (String nome : invitati) {
            if (nome.equalsIgnoreCase(nomeUtente)) {
                presente = true;
                break;
            }
            
        }
    
    if (presente) {
        System.out.println("Sei nella lista invitati");
    } else {
        System.out.println("Non sei invitato");
    }
}
}