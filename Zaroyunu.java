import java.util.Random;

public class Zaroyunu {
    public static void main(String args []){
      int a_zar_1,a_zar_2,sayac_1=1;
      int b_zar_1, b_zar_2, sayac_2=1;
      Random rnd=new Random();
      
      // oyuncu 1
      a_zar_1=rnd.nextInt(6)+1;          // secılecek degerler 0 ile 6 arasında (dahıl degıller)
      System.out.print("1. oyuncunun birinci zarı :" + a_zar_1+ " ");
      
      a_zar_2=rnd.nextInt(6)+1;
      System.out.println("ikinci zarı: " + a_zar_2);
      System.out.println("sayaç: " + sayac_1);
      
      while(a_zar_1+a_zar_2!=12){
        a_zar_1=rnd.nextInt(6)+1;
        System.out.print("1. oyuncunun birinci zarı :" + a_zar_1+ " ");
        
        a_zar_2=rnd.nextInt(6)+1;
        System.out.print("ikinci zarı: " + a_zar_2);
        System.out.println();

         sayac_1++;
         System.out.println("sayaç: "+sayac_1);
      }

      System.out.println("*************************************************************");

      //oyuncu 2

      b_zar_1=rnd.nextInt(6)+1;
      System.out.print("2. oyuncunun birinci zarı: " + b_zar_1 + " ");
      b_zar_2=rnd.nextInt(6)+1;
      System.out.println("ikinci zarı: " + b_zar_2);
      System.out.println("sayac: " + sayac_2);

      while(b_zar_1+b_zar_2!=12){
        b_zar_1=rnd.nextInt(6)+1;
        System.out.print("2. oyuncunun birinci zarı: " + b_zar_1+" ");
        b_zar_2=rnd.nextInt(6)+1;
        System.out.println("ikinci zarı: " + b_zar_2);
        sayac_2++;
        System.out.println("sayaç: "+sayac_2);
      }

      // kazananı bulma
      System.out.println("========================================================");
         if(sayac_1<sayac_2){
            System.out.println("1. oyuncu kazandı tebrikler!!!");
         }else if(sayac_2<sayac_1){
            System.out.println("ikinci oyuncu kazandı tebrikler!!!");
         }else{
            System.out.println("oyun berabere tebrikler!!!");
         }

    
    }
    
}
