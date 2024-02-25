import java.util.Scanner;

public class DizidenOgeSilme {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("dizi boyutu girin");
        int boyut = input.nextInt();
        int[] dizi = new int[boyut];

        System.out.print("dizi elemanları:");
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int) (Math.random() * 100);
            System.out.print(dizi[i] + " ");
        }
        System.out.println("\nsilmek istediğiniz elemanı girin");
        int sil = input.nextInt();

        boolean eleman_var_mi=false;

        if (ElemanBulma(sil, dizi)==false){
            System.out.println("silinecek eleman dizide bulunamadı");
        } else {
            System.out.print("dizinin son hali:");
                for (int k = 0; k < dizi.length; k++) {
                    if (dizi[k] == sil) {
                        continue;
                    } else {
                        System.out.print(dizi[k] + " ");
                    }
                }
        }

    }

    public static boolean ElemanBulma(int num, int [] array)
    {
        boolean eleman=false;
        for(int i=0; i<array.length; i++)
        {
            if(array[i]!= num)
            {
                eleman=false;
            }else
            {
                eleman=true;
                break;
            }
        }
        return eleman;
    }
}
