import java.util.Scanner;
public class EnBuyukIkinciEleman {
    public static void main(String args []){
        Scanner input=new Scanner(System.in);
        System.out.println("dizi boyutu girin");
        int boyut=input.nextInt();
        int [] dizi=new int[boyut];
 
        System.out.print("dizi elemanları:");
        for(int i=0; i<dizi.length; i++){
            dizi[i]=(int)(Math.random()*100);
            System.out.print(dizi[i] + " ");
        }

        // dizi sıralama

        int temp;
        for(int i=0; i<dizi.length; i++){
            for(int j=i+1; j<dizi.length; j++){
                if(dizi[i]<dizi[j]){
                    temp=dizi[i];
                    dizi[i]=dizi[j];
                    dizi[j]=temp;
                }
            }
        }

        // sıralı dizi yazdırma
        System.out.print("\nsıralı dizi:");
        for(int k=0; k<dizi.length; k++){
            System.out.print(dizi[k] + " ");
        }System.out.println("\ndizinin en büyük ikinci elemanı:" + dizi[1]);
    }
}
