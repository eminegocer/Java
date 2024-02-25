import java.util.Scanner;

public class OgeleriTersCevirme {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("dizi boyutu girin");
        int boyut = input.nextInt();
        int dizi[] = new int[boyut];

        int temp;
        System.out.print("dizi elemanları:");
        // dizi elemanlarını rastgele atar
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int) (Math.random() * 100);
            System.out.print(dizi[i] + " ");
        }
        for (int i = 0; i < dizi.length / 2; i++) {
            temp = dizi[i];
            dizi[i] = dizi[boyut - i - 1];
            dizi[boyut - i - 1] = temp;
        }
        System.out.print("\ndizinin tersten elemanları:");
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + " ");
        }
    }
}
