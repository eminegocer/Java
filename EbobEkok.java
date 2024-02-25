import java.util.Scanner;

public class EbobEkok {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("birinci sayıyı giriniz");
        int num1 = input.nextInt();
        System.out.println("ikinci sayıyı giriniz");
        int num2 = input.nextInt();

        System.out.println("sayıların ebobu:" + EbobBul(num1, num2));

        // sayiların ekoku
        if (EbobBul(num1, num2) == 1) {
            System.out.println("Sayıların ekoku:" + num1 * num2);
        }else
        {
            int ekok=num1*num2/EbobBul(num1, num2);
            System.out.println("Sayıların ekoku:" + ekok);
        }
    }

    // sayıların ebobunu bulmak için yazılmış metot
    public static int EbobBul(int num1, int num2) {
        int i = 2;
        int ebob = 1;
        while (num1 != 1 && num2 != 1) {
            if (num1 % i == 0 && num2 % i == 0) {
                ebob *= i;
                num1 /= i;
                num2 /= i;
            } else {
                if (i++ > num1 || i++ > num2) {
                    break;
                } else {
                    i++;
                }
            }
        }

        return ebob;
    }
}
