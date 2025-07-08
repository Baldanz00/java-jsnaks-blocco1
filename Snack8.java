import java.util.Scanner;
public class Snack8 {
  public static void main (String[] args) {
    Scnner scan = new Scanner(System.in);
    System.out.print("Inserisci un numero di 4 cifre: ");
    int num= scanner.nextInt();

    if (num<1000 || num>9999) {
      System.out.print("Il numero deve avere esattamente 4 cifre.");
    } else {
      int somma = 0 ;
      while (num>0) {
        somma += num % 10;
        num /=10;
      }
      
      System.out.println("La somma delle cifre è: " + somma);
    }
  }
}

    
