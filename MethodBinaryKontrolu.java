import java.util.Scanner;
public class MethodBinaryKontrolu {
    public static void main(String args []){
        Scanner input=new Scanner(System.in);
        System.out.println("sayıyı girin");
        int num=input.nextInt();
        KontrolEt(BinaryKontrolEt(num));

    }public static boolean BinaryKontrolEt(int num){
        String number=String.valueOf(num);
        boolean binary_mi=true;
        for(int i=0; i<number.length(); i++){
            char temp=number.charAt(i);
            if(temp!='0' && temp!='1'){      // karkater alındığ için tek tırnak içined kontrol olmalı
                binary_mi=false;
            }
        } return binary_mi;
    }


    public static void KontrolEt(boolean deger){
        if(deger){
            System.out.println("girilen sayı binary");
        }else{
            System.out.println("sayı binary değil");
        }
    }
}
