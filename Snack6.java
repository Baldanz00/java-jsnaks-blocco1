import java.util.Scanner;

public class Snack6{
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Inserisci un  numero N: ");
    int n = scan.nextInt();
    for (int i=1; i<n;i++) {
      int cubo = i*i*i;
      System.out.println("Cubo di" + i + "=" + cubo);
    }
  }
}
