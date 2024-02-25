package Interface2;

public class Romanlar implements IEKitapOlustur,IBaskiAl,ISeslendir {
    Romanlar(){

    }        
    public void KitapSec(){

    }
    public void baskiAl(){
        System.out.println("roman kitaplari e-kitaplara baski alinabilir");
    }
    public void seslendir(){
        System.out.println("roman kitaplari seslendirilebilir");
    }
    public void EKitapOlustur(){
        System.out.println("roman kitaplari E-Kitap olarakm olusturulabilir");
    }
}
