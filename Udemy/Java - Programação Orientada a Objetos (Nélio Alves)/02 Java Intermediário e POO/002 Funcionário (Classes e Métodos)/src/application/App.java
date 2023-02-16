package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Employee;

public class App {
  public static void main(String args[]) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    Employee Emp = new Employee();

    System.out.print("Name: ");
    Emp.name = sc.nextLine();
    System.out.print("Gross salary: ");
    Emp.grossSalary = sc.nextDouble();
    System.out.print("Tax: ");
    Emp.tax = sc.nextDouble();

    System.out.println("Employee: " + Emp);
    System.out.println();

    System.out.printf("Wich percentage to increase salary? ");
    double percentage = sc.nextDouble();
    Emp.increaseSalary(percentage);
    System.out.println();

    System.out.println("Updated Data: " + Emp);
    sc.close();
  }
}