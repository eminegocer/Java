import java.util.Scanner;

public class Faktoriyel {
    public static void main(String args []){
        Scanner input=new Scanner(System.in);

        int carpim=1;
        System.out.println("faktöriyeli hesaplanacak olan sayıyı giriniz");
        int num=input.nextInt();

        for(int i=1; i<=num; i++){
           carpim*=i;
        }System.out.println("faktöriyel: " + carpim);
    }
}
