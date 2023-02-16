package entities;

public class Student {
  public String name;
  public double gradeQuarter1;
  public double gradeQuarter2;
  public double gradeQuarter3;

  public double finalGrade() {
    return gradeQuarter1 + gradeQuarter2 + gradeQuarter3;
  }

  public double missingPoints() {
    if (finalGrade() >= 60) {
      return 0.0;
    }
    return 60.00 - finalGrade();
  }

  public String hasApproved() {
    if (finalGrade() >= 60) {
      return "PASS";
    }

    return "FAILED";
  }

}
