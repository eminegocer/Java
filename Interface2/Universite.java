package Interface2;

public class Universite extends Kitaplar implements  IEKitapOlustur{
    Universite(){

    }
    public void KitapSec(){

    }
    public void baskiAl(){
        System.out.println("üniveriste kitaplari e-kitaplardan baski alinabilir");
    }
    public void EKitapOlustur(){
        System.out.println("Üniversite kitaplari E-Kitap olarak oluşturulabilir");
    }
}
