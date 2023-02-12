import java.util.Scanner;

class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int workedHours = sc.nextInt();
    sc.nextLine();
    double hourlyWage = sc.nextDouble();

    System.out.printf("NUMBER = %d\n", number);
    System.out.printf("SALARY = U$ %.2f\n", workedHours * hourlyWage);

    sc.close();
  }
}