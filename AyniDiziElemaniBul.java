import java.util.Scanner;

public class AyniDiziElemaniBul{
    public static void main(String args []){
        Scanner input=new Scanner(System.in);
        System.out.println("birinci dizi boyutunu girin");
        int boyut1=input.nextInt();
        System.out.println("ikinci dizi boyutunu girin");
        int boyut2=input.nextInt();
        int[] dizi1=new int[boyut1];
        dizi1=diziOlustur(boyut1, dizi1);
        int [] dizi2=new int[boyut2];
        dizi2=diziOlustur(boyut2, dizi2);
        diziYazdir( dizi1);
        System.out.println();
        diziYazdir( dizi2);
        elemanKarsilastir(dizi1, dizi2);
    }public static int[] diziOlustur(int num,int [] dizi){
        for(int i=0; i<num; i++){
            dizi[i]=(int)(Math.random()*100);
        }return dizi;
    }
    public static void diziYazdir( int[] dizi){
        System.out.print("dizi elemanları:");
        for(int i=0; i<dizi.length; i++){
            System.out.print(dizi[i] + " ");
        }
    }
    public static void elemanKarsilastir(int[]dizi1, int []dizi2 ){
        System.out.print("\nayni elemanlar:");
        for(int i=0; i<dizi1.length; i++){
            for(int j=0; j<dizi2.length; j++){
                if(dizi1[i]==dizi2[j]){
                    System.out.print(dizi1[i] + " ");
                }
            }
        }
    }
}
