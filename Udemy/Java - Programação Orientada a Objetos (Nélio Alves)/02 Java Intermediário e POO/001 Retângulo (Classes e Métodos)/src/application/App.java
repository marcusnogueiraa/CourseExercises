package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Rectangle;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rectangle newRect = new Rectangle();

        System.out.println("Enter rectangle width and height:");
        newRect.width = sc.nextDouble();
        newRect.height = sc.nextDouble();

        System.out.printf("AREA = %.2f\n", newRect.area());
        System.out.printf("PERIMETER = %.2f\n", newRect.perimeter());
        System.out.printf("DIAGONAL = %.2f\n", newRect.diagonal());
        sc.close();
    }
}
