import java.util.Scanner;

class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    double salary = sc.nextDouble();

    if (2000 > salary) {
      System.out.println("ISENTO");
    } else if (3000 >= salary) {
      System.out.printf("R$ %.2f", 0.08 * (salary - 2000));
    } else if (4500 >= salary) {
      System.out.printf("R$ %.2f", (salary - 3000) * 0.18 + 0.08 * 1000);
    } else {
      System.out.printf("R$ %.2f", (salary - 4500) * 0.28 + 1500 * 0.18 + 0.08 * 1000);
    }

    sc.close();
  }
}