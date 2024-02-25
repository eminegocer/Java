import java.util.Scanner;
public class DizidekiOgeyiArama {
    public static void main(String args []){
        Scanner input=new Scanner(System.in);
        System.out.println("dizi boyutunu giriniz");
        int boyut=input.nextInt();
        int [] dizi=new int[boyut];
        

        System.out.print("dizi elemanları:");
        for(int i=0; i<dizi.length; i++  ){
            dizi[i]=(int)(Math.random()*100);
            System.out.print(dizi[i] + " ");
        }

        System.out.println("\naranacak elemanı giriniz");
        int aranacak=input.nextInt();
        boolean eleman_var_mı=false;
        int eleman_indisi=dizi[0];

        for(int i=0; i<dizi.length; i++){
            if(aranacak==dizi[i]){
                eleman_var_mı=true;
                eleman_indisi=i;
            }
        }if(eleman_var_mı){
            System.out.println("\naranan eleman dizide mevcut ve " + (eleman_indisi+1) +". eleman");
        }else{
            System.out.println("\naranan eleman dizide mevcut değil");
        }
    }
}
