import java.util.Scanner;

public class ModAlma {
  public static void main(String args []){
    Scanner scanner=new Scanner(System.in);
    System.out.println("modu alınacak sayıyı giriniz  giriniz");
    int sayı=scanner.nextInt();

    System.out.println("alınacak mod degerını gırınız");
    int modDegeri=scanner.nextInt();

    int bölüm=sayı/modDegeri;
    int çarpım=modDegeri*bölüm;
    int kalan=sayı-çarpım;

    System.out.println("sayının modu: " + kalan);
  }
}
// döngü ile

