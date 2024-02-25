import java.util.Scanner;

public class DiziyeOgeEkleme {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("dizi boyutu giriniz");
        int boyut = input.nextInt();
        int[] dizi = new int[boyut + 1];

        System.out.print("dizi elemanları:");
        for (int i = 0; i < dizi.length - 1; i++) {
            dizi[i] = (int) (Math.random() * 100);
            System.out.print(dizi[i] + " ");
        }
        System.out.println("\neklenecek elemanı giriniz");
        int ekle = input.nextInt();

        System.out.println("dizide eklenecek sırayı giriniz");
        int loc = input.nextInt();

        if (loc > boyut + 1) {
            System.out.println("Dizi boyutuna uygun bir sıra değil");
        } else {

            for (int i = dizi.length - 1; i >= loc; i--) {
                dizi[i] = dizi[i - 1];
            }
            dizi[loc - 1] = ekle;

            System.out.print("elemanın eklenmiş hali:");
            for (int i = 0; i < dizi.length; i++) {
                System.out.print(dizi[i] + " ");
            }
        }

    }
}
