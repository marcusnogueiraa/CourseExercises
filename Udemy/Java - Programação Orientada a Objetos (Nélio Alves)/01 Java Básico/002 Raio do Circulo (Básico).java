import java.util.Scanner;

class Main {
  public static void main(String args[]) {
    double pi = 3.14159;

    Scanner input = new Scanner(System.in);
    double raio = input.nextDouble();

    System.out.printf("A=%.4f", raio * raio * pi);
    input.close();
  }
}
