import java.util.Scanner;
public class MatrisYildiz {
    public static void main(String args []){
        Scanner input=new Scanner(System.in);
        System.out.println("satır sayısı:");
        int satir=input.nextInt();
        System.out.println("sütun sayısı:");
        int sutun=input.nextInt();

        // satır ve sütun sayısına göre çizilmiş dikdörtgen
        for(int i=0; i<satir; i++){
            for(int j=0; j<sutun; j++){
                System.out.print("* ");
            }System.out.println();
        }
        System.out.println("-----------------------------");

        // satır sayısına göre çizilmiş eşkenar dik üçgen
        for(int i=0; i<satir; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }System.out.println();
        }
    }
}
