import java.util.Scanner;
import java.util.Locale;

public class App {
  public static void main(String args[]) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    System.out.print("Quantos numeros voce vai digitar? ");
    int n = sc.nextInt();
    double[] vect = new double[n];
    double soma = 0;

    for (int i = 0; i < n; i++) {
      System.out.print("Digite um numero: ");
      vect[i] = sc.nextDouble();
      soma += vect[i];
    }

    System.out.print("\nVALORES = ");
    for (double number : vect) {
      System.out.printf("%.1f ", number);
    }

    System.out.printf("\nSOMA = %.2f", soma);
    System.out.printf("\nMEDIA = %.2f", soma / n);
    sc.close();
  }
}