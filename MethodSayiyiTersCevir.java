
import java.util.Scanner;
public class MethodSayiyiTersCevir {
    public static void main(String args []){
        Scanner input=new Scanner(System.in);
        System.out.println("sayı girin:");
        int num=input.nextInt();
        int[] new_dizi=SayiCevir(num);
        Yazdir(new_dizi);
    }
    public static int[] SayiCevir(int num){
        int number=num;
        int basamak=0;
        int temp;
        while(number!=0){
            number/=10;
            basamak++;
        }
        int [] dizi=new int[basamak];
        for(int i=0; i<basamak; i++){
            dizi[i]=num%10; 
            num/=10;
        }
        for(int i=0; i<basamak; i++){
            temp=dizi[i];
            dizi[i]=dizi[basamak-i-1];
            dizi[basamak-i-1]=temp;
        }
        return dizi;
    }

    public static void Yazdir(int[] dizi){
        System.out.println("sayının tersi:");
        for(int i=0; i<dizi.length; i++){
            System.out.print(dizi[i]);
        }
    }
}
