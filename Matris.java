import java.util.Scanner;

public class Matris {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("satır sayısı girin: " ); 
        int satir_sayisi = read.nextInt();
        System.out.print("sütun sayısı girin: ");
        int sütun_sayisi = read.nextInt();
        int dizi [][] = new int[satir_sayisi][sütun_sayisi];
 
 
        for(int i = 0; i<satir_sayisi; i++){
             for(int j = 0; j<sütun_sayisi; j++){
                 dizi[i][j]=(int)(Math.random()*100); 
             }
         }
         for(int i=0 ;i<satir_sayisi;i++){
             for(int j=0;j<sütun_sayisi;j++){
                 System.out.printf("%4d" , dizi[i][j]);
             }
             System.out.println();
         }
         int en_kücüksayi=Integer.MAX_VALUE;
         int en_büyüksayi=Integer.MIN_VALUE;
         for(int i = 0; i<satir_sayisi; i++){
             for(int j=0;j<sütun_sayisi;j++){
                 if(dizi[i][j]<en_kücüksayi){
                     en_kücüksayi=dizi[i][j];
                 }
                 if(dizi[i][j]>en_büyüksayi){
                     en_büyüksayi=dizi[i][j];
                 }
             }
         }
 
         System.out.println("en küçük eleman: " + en_kücüksayi);
         System.out.println("en büyük eleman: " + en_büyüksayi);
 
     }
     
    
}
