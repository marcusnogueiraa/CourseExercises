import java.util.Scanner;

class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    for (int i = 1; i <= number; i = i + 2) {
      System.out.println(i);
    }

    sc.close();
  }
}