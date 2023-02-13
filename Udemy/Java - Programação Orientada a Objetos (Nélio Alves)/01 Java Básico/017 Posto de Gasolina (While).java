import java.util.Scanner;

class Main {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int option;

    int alcool = 0;
    int gasolina = 0;
    int diesel = 0;

    while (true) {
      option = sc.nextInt();
      if (option == 1) {
        alcool += 1;
      } else if (option == 2) {
        gasolina += 1;
      } else if (option == 3) {
        diesel += 1;
      } else if (option == 4) {
        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool: %d\n", alcool);
        System.out.printf("Gasolina: %d\n", gasolina);
        System.out.printf("Diesel: %d\n", diesel);
        break;
      } else {
        continue;
      }
    }

    sc.close();
  }
}