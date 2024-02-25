package Abstracts;

public class KutuTest {
    public static void main(String args[]) {
        Kutu kutu1=new Kutu(20.4,10.5, 8.49);
        kutu1.hacimHesapla();
        System.out.println("Kutunun hacmi:" + kutu1.hacimHesapla2());
    }
}
