import java.util.Scanner;
public class MethodAsalSayiyiBul {
    public static void main(String args []){
        Scanner input=new Scanner(System.in);
        System.out.println("sayı girin");
        int num=input.nextInt();
        KontrolEt(AsalMi(num));

    }public static boolean AsalMi(int num){
        boolean asal_mi=true;
        for(int i=2; i<Math.sqrt(num);i++){
            if(num%i==0){
                asal_mi=false;
            }
        }return asal_mi;
    }

    public static void KontrolEt(boolean deger){
        if(deger){
            System.out.println("sayı asal");
        }else{
            System.out.print("sayı asal değil");
        }
    }
}
