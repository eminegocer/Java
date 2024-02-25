package Interface2;

public class MainTest {
    public static void main(String args []){
        Kitaplar k1=new Universite();
        k1.baskiAl();
        Universite k2=new Universite();
        k2.EKitapOlustur();
        k2.EKitapOlustur2();
        System.out.println(k2.BaskiBoyutu);
        IBaskiAl b1=new CocukKitaplari();
        b1.baskiAl();

    }
}
