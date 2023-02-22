import java.util.Scanner;

public class App {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int[] vect = new int[n];
    for (int i = 0; i < n; i++) {
      vect[i] = sc.nextInt();
    }

    System.out.println("NUMEROS NEGATIVOS:");
    for (int number : vect) {
      if (number < 0) {
        System.out.println(number);
      }
    }

    sc.close();
  }
}