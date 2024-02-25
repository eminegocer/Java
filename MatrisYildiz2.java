import java.util.Scanner;

public class MatrisYildiz2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("satır sayısı:");
        int satir = input.nextInt();

        // satir sayısına uygun eşkenar dik üçgen çizimi
        for (int i = 0; i < satir; i++) {
            for (int j = satir; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("----------------------");

        // satir sayısına uygun eşkenar dörtgen çizimi
        for (int i = 0; i < satir; i++) {
            for (int j = satir - i; j > 0; j--) {
                System.out.print("  ");
            }
            for (int j = 2 * i + 1; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i < satir; i++) {
            for (int j = i; j >= 0; j--) {
                System.out.print("  ");
            }
            for (int j = (satir - i) * 2; j > 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
