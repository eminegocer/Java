import java.util.Scanner;
public class MethodMukemmelSayi {
    public static void main(String args []){
        Scanner input=new Scanner(System.in);
        System.out.println("sayı girin");
        int num=input.nextInt();
        MukemmelMi(MukemmelSayi(num), num);
    }
    public static int MukemmelSayi(int num){
        int top=0;
        for(int i=1; i<num; i++){
            if(num%i==0){
                top+=i;
            }
        }return top;
    } public static void MukemmelMi(int num, int num2){
        if(num==num2){
            System.out.println("sayı mükemmel");
        }else{
            System.out.println("sayı mükemmel değil");
        }
    }
}
