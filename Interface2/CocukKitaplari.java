package Interface2;

public class CocukKitaplari extends Kitaplar implements IBaskiAl,ISeslendir{
    CocukKitaplari(){

    }
    public void KitapSec(){

    }
    public void baskiAl(){
        System.out.println("cocuk kitaplari e-kitaplara baski alinabilir");
    }
    public void seslendir(){
        System.out.println("cocuk kitaplari seslendirilebilir");
    }
}
