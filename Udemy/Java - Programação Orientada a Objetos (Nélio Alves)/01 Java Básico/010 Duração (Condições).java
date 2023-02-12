import java.util.Scanner;

class Main {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int begin = sc.nextInt();
    int end = sc.nextInt();

    if (end > begin) {
      System.out.printf("O JOGO DUROU %d HORA(S)", end - begin);
    } else {
      System.out.printf("O JOGO DUROU %d HORA(S)", 24 - begin + end);
    }

    sc.close();
  }
}