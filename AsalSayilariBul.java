import java.util.Scanner;

public class AsalSayilariBul {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("dizi boyutunu giriniz");
        int boyut = input.nextInt();

        int dizi[] = new int[boyut];

        // dizi elemanları rastgele atanır
        System.out.print("dizi elemanları:");
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int) (Math.random() * 100);
            System.out.print(dizi[i] + " ");
        }

        System.out.print("\nasal elemanlar:");

        for (int j = 0; j < dizi.length; j++) {
            boolean asal_mi = true;
            for (int i = 2; i < dizi[j]; i++) {
                if (dizi[j] % i == 0) {
                    asal_mi = false;
                    break;
                }
            }
            if (asal_mi == true) {
                System.out.print(dizi[j] + " ");
            }
        }

    }
}
