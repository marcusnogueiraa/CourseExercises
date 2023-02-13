import java.util.Scanner;

class Main {
  public static void main(String str[]) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    for (int i = 0; i < x; i++) {
      double num1 = sc.nextDouble();
      double num2 = sc.nextDouble();
      double num3 = sc.nextDouble();

      System.out.printf("%.1f\n", (num1 * 2 + num2 * 3 + num3 * 5) / 10);
    }

    sc.close();
  }
}