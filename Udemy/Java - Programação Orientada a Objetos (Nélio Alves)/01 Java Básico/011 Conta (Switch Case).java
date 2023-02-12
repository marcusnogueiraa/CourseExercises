import java.util.Scanner;

class Main {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int code = sc.nextInt();
    int quantity = sc.nextInt();

    switch (code) {
      case 1:
        System.out.printf("Total: R$ %.2f", quantity * 4.0);
        break;
      case 2:
        System.out.printf("Total: R$ %.2f", quantity * 4.5);
        break;
      case 3:
        System.out.printf("Total: R$ %.2f", quantity * 5.0);
        break;
      case 4:
        System.out.printf("Total: R$ %.2f", quantity * 2.0);
        break;
      case 5:
        System.out.printf("Total: R$ %.2f", quantity * 1.5);
        break;
    }

    sc.close();
  }
}