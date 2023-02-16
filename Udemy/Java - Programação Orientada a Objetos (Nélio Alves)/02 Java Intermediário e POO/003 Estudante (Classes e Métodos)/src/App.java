import java.util.Scanner;
import java.util.Locale;
import entities.Student;

public class App {
  public static void main(String args[]) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Student stud = new Student();

    stud.name = sc.nextLine();
    stud.gradeQuarter1 = sc.nextDouble();
    stud.gradeQuarter2 = sc.nextDouble();
    stud.gradeQuarter3 = sc.nextDouble();

    System.out.println("FINAL GRADE = " + stud.finalGrade());
    System.out.println(stud.hasApproved());
    System.out.printf("MISSING %.2f POINTS", stud.missingPoints());
    sc.close();
  }
}
