import java.util.Scanner;

public class ArmstrongSayilar {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("sayı giriniz");
    int num = input.nextInt();

    int sayac = 0;
    int toplam = 0;
    int carp;
    int kalan = 0;
    int number = num;
    int sayi = num;
    while (number > 0) { 
      number /= 10;
      sayac++;
    }
    System.out.println("girilen sayı:" + sayac + " basamaklı");

    while (num > 0) {
      kalan = num % 10;
      carp = 1; // her döngüde çarpım 1e güncellenmeli
      for (int i = 1; i <= sayac; i++) {

        carp *= kalan;
      }
      toplam += carp;
      num /= 10;
    }
    System.out.println("sayının basamak kuvvetlerinin değeri:" + toplam);

    if (toplam != sayi) {
      System.out.println("armstrong değil");
    } else {
      System.out.println("armstrong ");
    }
  }
}
