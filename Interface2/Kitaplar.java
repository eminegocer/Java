package Interface2;

public abstract  class Kitaplar implements IBaskiAl{
    public String adi;
    public String ISBN;
    public String yazar;
    public Double fiyat;
    public String basimYili;
    Kitaplar(){

    }
    Kitaplar(String adi,String yazar, Double fiyat){
        this.adi=adi;
        this.yazar=yazar;
        this.fiyat=fiyat;
    }
    public abstract void KitapSec();
    void KitapSec2(){
        
    }
}  
