import java.util.Scanner;

public class AsalBolenler {
    public static void main(String args []){
        Scanner input=new Scanner(System.in);
        System.out.println("asal bölenlerinin bulunmasını istediğiniz sayıyı giriniz");
        long sayi=input.nextLong();
        int sayac=0;

        int en_b_bolen=0;
        for (int i=2; i<=sayi; ){
           if(sayi%i==0){
            sayi=sayi/i;
            sayac++;
            System.out.print(i + " " );
           
            if(en_b_bolen<i){
                en_b_bolen=i;
            }

           }else{
            i++;
           }
        }System.out.println(" en büyük böleni: " + en_b_bolen);

         
    }
} 
