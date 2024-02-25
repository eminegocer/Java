import java.util.Scanner;

public class MethodStringTersCevirme {
    public static void main(String args []){
        Scanner input=new Scanner(System.in);
        System.out.println("ters çevrilecek kelimeyi yazın");
        String letter=input.nextLine();
        TersYaz(letter);
        System.out.println("\nkelimenin tersi:" + TersCevir(letter));
    }
    public static void TersYaz(String kelime){
        char temp;
        for(int i=kelime.length()-1; i>=0; i--){
            System.out.print(kelime.charAt(i));
        }
    }
    public static String TersCevir(String kelime){
        String temp="";
        for(int i=kelime.length()-1; i>=0; i--){
            char temp2=kelime.charAt(i);
            temp+=String.valueOf(temp2);

        }
        return temp;
    }
}