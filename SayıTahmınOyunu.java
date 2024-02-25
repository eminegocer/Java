import java.util.Random;
import java.util.Scanner;

public class SayıTahmınOyunu {
    public static void main(String args[] ){
        Scanner input=new Scanner(System.in);
        Random rnd=new Random();
        int num=rnd.nextInt(100);
        int sayac=1;

        System.out.println("bilgisayarın ürettiği sayıyı tahmin edınız");
        int tahmin=input.nextInt();

        while(tahmin!=num){
      
            if(tahmin<num){
                System.out.println("küçük sayı girdiniz. Daha büyük sayı giriniz");
            }else{
                System.out.println("büyük sayı girdiniz. Daha küçük sayı giriniz"); 
            } tahmin=input.nextInt();
            sayac++;
        }System.out.println("tebrikler doğru tahmin");
        System.out.println(sayac+". tahminde doğru cevabı buldunuz");
    }
}
