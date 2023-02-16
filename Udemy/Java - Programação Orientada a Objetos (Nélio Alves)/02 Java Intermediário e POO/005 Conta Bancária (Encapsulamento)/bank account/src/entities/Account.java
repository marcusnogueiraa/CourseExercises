package entities;

public class Account {

  private final double TAX = 5.00;

  private String number;
  private String name;
  private double balance;

  public Account(String number, String name) {
    this.number = number;
    this.name = name;
  }

  public Account(String number, String name, double firstDeposit) {
    this.number = number;
    this.name = name;
    deposit(firstDeposit);
  }

  public void setName(String newName) {
    this.name = newName;
  }

  public String getName() {
    return name;
  }

  public String getNumber() {
    return number;
  }

  public double getBalance() {
    return balance;
  }

  public void deposit(double valueDeposit) {
    this.balance += valueDeposit;
  }

  public void withdraw(double valueWithdraw) {
    this.balance -= valueWithdraw + TAX;
  }

  public String toString() {
    return "Account " + this.number +
        ", Holder: " + this.name +
        ", Balance: $ " + String.format("%.2f", this.getBalance());
  }

}
