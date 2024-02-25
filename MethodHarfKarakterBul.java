import java.util.Scanner;
public class MethodHarfKarakterBul {
    public static void main(String args []){
        Scanner input=new Scanner(System.in);
        System.out.println("String girişi yapın");
        String giris=input.nextLine();
        char[] karakterler=new char[giris.length()];
        KontrolEt(ElemanKontrolu(giris, karakterler));

    }public static char[] ElemanKontrolu(String giris, char...karakterler){

        for(int i=0; i<giris.length(); i++){
            karakterler[i]=giris.charAt(i);
        }
        return karakterler;
    }
    public static void KontrolEt(char[] karkaterler){
        for(int i=0; i<karkaterler.length; i++){
            if(Character.isDigit(karkaterler[i])){
                System.out.println(karkaterler[i] + " karakteri bir sayıdır");
            }if(Character.isLetter(karkaterler[i])){
                System.out.println(karkaterler[i]+ " karakteri bir harftir");
            }else{
                System.out.println(karkaterler[i] + " bir karakterdir");
            }
        }
    }
}
