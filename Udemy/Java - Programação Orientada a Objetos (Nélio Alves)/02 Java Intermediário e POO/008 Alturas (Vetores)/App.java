import java.util.Scanner;
import java.util.Locale;

public class App {
  public static void main(String args[]) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    System.out.print("Quantas pessoas serao digitadas? ");
    int n = sc.nextInt();

    String[] names = new String[n];
    int[] idades = new int[n];
    double[] alturas = new double[n];
    double somaAlturas = 0;
    double menoresDe16 = 0;

    for (int i = 0; i < n; i++) {
      System.out.printf("Dados da %da pessoa:\n", i + 1);
      System.out.print("Nome: ");
      names[i] = sc.next();
      System.out.print("Idade: ");
      idades[i] = sc.nextInt();
      System.out.print("Altura: ");
      alturas[i] = sc.nextDouble();

      if (alturas[i] < 16) {
        menoresDe16 += 1;
      }

      somaAlturas += alturas[i];
    }

    menoresDe16 = menoresDe16 / n * 100.0;

    System.out.printf("\nAltura media: %.2f", somaAlturas / n);
    System.out.printf("\nPessoas menores de 16 anos: %.1f", menoresDe16);

    sc.close();
  }
}