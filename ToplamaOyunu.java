
import java.util.Scanner;

public class ToplamaOyunu {
  
  
    public static void main(String args []){
    Scanner scanner=new Scanner(System.in);
    int sayı1=(int)(Math.random()*100); //pc ye rastgele sayı aldırma fonksıyonu (random deger aralıgı 0 ve 1 arasında oldugundan 2 basamaklı sayı gelmesı için 100 ile carptım)
    int sayı2=(int)(Math.random()*100);
    int sonuc=sayı1+sayı2;
    
    System.out.println(sayı1 + " ile " + sayı2 + "'nin toplamı nedir?");
    int tahmin=scanner.nextInt();

    /*  while(sonuc!=tahmin){
        System.out.println("yanlış cevap tekrar deneyiniz");
        tahmin=scanner.nextInt();             //yeni bir tahmin için giriş al
     }
     System.out.println("tebrikler bildiniz");*/ //sonsuz deneme sansı var


     //3deneme sansı var
     
     for(int i=0; i<3; i++){
    if(i<2 && tahmin!=sonuc){
        
        System.out.println("yanlış cevap tekrar deneyiniz");
        tahmin=scanner.nextInt();
    }    

    else if(i<=2 && tahmin==sonuc){
            System.out.println("tebrikler doğru cevap!!"); 
         break; 
    }
    
    else{
        System.out.println("3 kez denediniz oyun sona erdi");
    }
 
     }

    }
}
