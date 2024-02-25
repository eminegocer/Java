import java.util.Scanner;

public class Fibonacci {
  public static void main(String args []){
    Scanner input=new Scanner(System.in);
    int temp,num1,num2;
    int top=0;
    num1=1; 
    num2=2;
    temp=0;
    System.out.println("fibonacci dizi eleman sayısı giriniz");
    int eleman=input.nextInt();

    System.out.print(1 + " " + 2 + " ");
    for(int i=0; i<eleman-2; i++){
       top=num1+num2;
       System.out.print(top + " ");
       temp=num1;
       num1=num2;
       num2=top;


    }

  }  
}
