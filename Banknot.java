import java.util.Scanner;

public class Banknot {
    public static void main(String args[]){
      Scanner input=new Scanner(System.in);
      int [] dizi={200,100,50,20,10,5,1};

      System.out.println("para miktarını giriniz");
      int para =input.nextInt();
      int banknot_sayısı;
 
      for(int i =0; i<dizi.length; i++){
        banknot_sayısı=para/dizi[i];
        if(para!=0){
            System.out.println(banknot_sayısı + " adet " + dizi[i]+ " öde");
        }
        para=para-banknot_sayısı*dizi[i];
      }
    
      
    }
    
}
