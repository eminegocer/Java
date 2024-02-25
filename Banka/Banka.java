import java.util.Scanner;
public class Banka {
  public static void main(String args []){
    Scanner input=new Scanner(System.in);

    Banka_Sinif hesap1=new Banka_Sinif();
    hesap1.hesap_bakiye=5400;
    hesap1.hesap_tipi="TL";
    hesap1.musteri_adi="emine göçer";
    hesap1.musteri_hesap_no=2300101;
    hesap1.paraCek(1500,"TL");
    System.out.println("------------------------------");
    hesap1.hesap_tipi="TL";
    hesap1.paraYatir(2000, "dolar");
  }   
}
