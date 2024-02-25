import java.util.Scanner;

public class FloydUcgenı {
   public static void main(String args []){
    Scanner input=new Scanner(System.in);
    System.out.println("satır sayısı giriniz");
    int satırSay=input.nextInt();
    int num=1;
     
           for(int i=1; i<=satırSay; i++){
            for(int j=1; j<=i; j++){
               System.out.print(num + " ");
               num++;
            }System.out.println();
           }
           
           
        
       
    
   } 
}
