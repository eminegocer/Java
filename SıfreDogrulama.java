import java.util.Scanner;

public class SıfreDogrulama {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);

        int sayac=0;
        String sifre="Baykar.98";
        System.out.println("parola giriniz");
        String parola=input.nextLine();


        while(!sifre.equals(parola)){
            System.out.println("şifre hatalı tekrar deneyiniz");
            System.out.println("parola giriniz");
            parola=input.nextLine();
            sayac++;
            if(sayac==2){
                System.out.println("3 başarısız giriş 30 saniye sonra tekrar deneyiniz");
                break;
            }
        }

        if(parola.equals(sifre)){
            System.out.println("başarılı giriş");
        }
         
    
    }
}
