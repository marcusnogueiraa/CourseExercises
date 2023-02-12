import java.util.Scanner;

class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    float A = sc.nextFloat();
    float B = sc.nextFloat();
    float C = sc.nextFloat();

    System.out.printf("TRIANGULO: %.3f\n", (A * C) / 2);
    System.out.printf("CIRCULO: %.3f\n", 3.14159 * C * C);
    System.out.printf("TRAPEZIO: %.3f\n", (A + B) * C / 2);
    System.out.printf("QUADRADO: %.3f\n", B * B);
    System.out.printf("RETANGULO: %.3f\n", A * B);

    sc.close();

  }
}